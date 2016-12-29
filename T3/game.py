import pygame,sys
pygame.init()

screen = pygame.display.set_mode ((900,650))
pygame.display.set_caption('Jogo')
clock = pygame.time.Clock()
bg = pygame.image.load('ferst.png')
grama = pygame.image.load('grass3.png')
parede = pygame.image.load('pedra.png')
caixa = pygame.image.load('caixa.png') #c
caixa_quebrada = pygame.image.load('caixa_quebrada.png') #q
fogueira = [pygame.image.load('fogueira2.png'),pygame.image.load('fogueira3.png'),pygame.image.load('fogueira4.png')] #f
f_apagada = pygame.image.load('fogueira1.png') #a
arvore = pygame.image.load('arvore.png') #r
tronco = pygame.image.load('tronco.png') #t
portal = pygame.image.load('portal.png') #p
anima_fogo = 0
arquivo = open('mapa1.txt', 'r')
matrix = arquivo.read()
lmatrix = list(matrix)

def att_matrix(magia,prox_bloco):
    if(magia == "fogo" and lmatrix[prox_bloco] == 'c'):
        lmatrix[prox_bloco] = 'q'
    elif(magia == "agua" and lmatrix[prox_bloco] == 'f'):
        lmatrix[prox_bloco] = 'a'
    elif(magia == "fisico" and lmatrix[prox_bloco] == 'r'):
        lmatrix[prox_bloco] = 't'

def mapa():
    screen.blit(bg, (0, 0))
    x=1
    y=1
    aux = []
    auy = [] 
    cont = 1
    for i in lmatrix:
        if(i == ' ' or i == '\n'):
            continue
        
        screen.blit(grama, (x+100,y+100))
        if(i == '1'):
            screen.blit(parede, (x+100,y+100))
        elif(i == 'c'):
            screen.blit(caixa, (x+100,y+100))
        elif(i == 'q'):
            screen.blit(caixa_quebrada, (x+100,y+100))
        elif(i == 'f'):
            global anima_fogo
            screen.blit(fogueira[ int(anima_fogo)], (x+100,y+100))
            anima_fogo += 0.2
            if(anima_fogo >=3):
                 anima_fogo = 0
        elif(i == 'a'):
            screen.blit(f_apagada, (x+100,y+100))
        elif(i == 'r'):
            screen.blit(arvore, (x+90,y+30))
            aux.append(x+90)
            aux.append(y+30)
        elif(i == 't'):
            screen.blit(tronco, (x+100,y+100))
        elif(i == 'p'):
            screen.blit(portal, (x+100,y+100))
            
        x += 64
        if(cont % 11 == 0):
            y += 67
            x=0
        cont +=1
    return aux

class Player():

    def __init__(self):
        #base x110 y98
        self.bx = 7
        self.by = 4
        self.x = 110 + (self.bx*64) 
        self.y = 98 + (self.by*67)
        self.bloco = ((11*(2*(self.by))) + self.bx*2)   #((11*(2*y-1) -2) + x*2)
        self.imga_dir = [pygame.image.load('p_dir1.png'),
                    pygame.image.load('p_dir2.png'),
                    pygame.image.load('p_dir3.png'),
                    pygame.image.load('p_dir2.png'),
                    pygame.image.load('p_dir1.png')]
        self.imga_esq = [pygame.image.load('p_esq1.png'),
                    pygame.image.load('p_esq2.png'),
                    pygame.image.load('p_esq3.png'),
                    pygame.image.load('p_esq2.png'),
                    pygame.image.load('p_esq1.png')]
        self.imga_cima = [pygame.image.load('p_cima1.png'),
                    pygame.image.load('p_cima2.png'),
                    pygame.image.load('p_cima3.png'),
                    pygame.image.load('p_cima2.png'),
                    pygame.image.load('p_cima1.png')]
        self.imga_baixo = [pygame.image.load('p_frente1.png'),
                    pygame.image.load('p_frente2.png'),
                    pygame.image.load('p_frente3.png'),
                    pygame.image.load('p_frente2.png'),
                    pygame.image.load('p_frente1.png')]
        self.magic_fogo = [pygame.image.load('fogo1.png'),
                    pygame.image.load('fogo2.png'),
                    pygame.image.load('fogo3.png'),
                    pygame.image.load('fogo4.png'),
                    pygame.image.load('fogo5.png'),
                    pygame.image.load('fogo6.png'),
                    pygame.image.load('fogo7.png'),
                    pygame.image.load('fogo8.png')]
        
        self.magic_agua = [pygame.image.load('agua1.png'),
                    pygame.image.load('agua2.png'),
                    pygame.image.load('agua3.png'),
                    pygame.image.load('agua4.png'),
                    pygame.image.load('agua5.png'),
                    pygame.image.load('agua6.png'),
                    pygame.image.load('agua7.png'),
                    pygame.image.load('agua8.png')]
        
        self.magic_fisico = [pygame.image.load('atk1.png'),
                    pygame.image.load('atk2.png'),
                    pygame.image.load('atk3.png'),
                    pygame.image.load('atk4.png'),
                    pygame.image.load('atk5.png'),
                    pygame.image.load('atk6.png'),
                    pygame.image.load('atk7.png'),
                    pygame.image.load('atk8.png')]
        
        self.animacao = 0
        self.direcao = 'esq'
        self.estado = 'andando' #'andando'
        self.magia = 'fogo'
        self.anima_magia = 0

    def desenha(self):
        
        # player.desenha()
        #print(self.animacao)
        aux = mapa()
        magicx = self.x
        magicy = self.y
        
        if self.direcao == 'dir':
            screen.blit(self.imga_dir[int(self.animacao)], (self.x, self.y))
            magicx = player.x + 64

        if self.direcao == 'esq':
            screen.blit(self.imga_esq[int(self.animacao)], (self.x, self.y))
            magicx = player.x - 64

        if self.direcao == 'cima':
            screen.blit(self.imga_cima[int(self.animacao)], (self.x, self.y))
            magicy = player.y - 66

        if self.direcao == 'baixo':
            screen.blit(self.imga_baixo[int(self.animacao)], (self.x, self.y))
            magicy = player.y + 66
            
        if self.estado == 'andando':
            self.animacao += 0.5
            if self.animacao >= 5:
                self.animacao = 0
                
        for i in range(0,len(aux),2):
            screen.blit(arvore, (aux[i],aux[i+1] ))

        if self.estado == 'usando_magia':
            

            if self.magia == 'fogo':
                screen.blit(self.magic_fogo[int(self.anima_magia)], (magicx-4, magicy))
            if self.magia == 'agua':
                screen.blit(self.magic_agua[int(self.anima_magia)], (magicx-8+self.anima_magia, magicy-5))
            if self.magia == 'fisico':
                screen.blit(self.magic_fisico[int(self.anima_magia)], (magicx, magicy))
                
            self.anima_magia += 0.5
            if self.anima_magia >= 8:
                self.anima_magia = 0
        
        clock.tick(40)
        pygame.display.flip()

    def andar(self):
        self.estado = 'andando'
        if self.direcao == 'dir':
            self.bloco = ((11*(2*(player.by))) + (player.bx+1)*2)
        if self.direcao == 'esq':
            self.bloco = ((11*(2*(player.by))) + (player.bx-1)*2)
        if self.direcao == 'cima':
            self.bloco = ((11*(2*(player.by-1))) + (player.bx)*2)
        if self.direcao == 'baixo':
            self.bloco = ((11*(2*(player.by+1))) + (player.bx)*2)
        
        #print(self.bloco)
        andarei = 2
        if(lmatrix[player.bloco] == "0"):
            andarei = 2
        elif(lmatrix[player.bloco] == "1" or lmatrix[player.bloco] == "c"  or lmatrix[player.bloco] == "r"):
            andarei = 0
        elif(lmatrix[player.bloco] == "f"):
            
            screen.blit(bg, (0, 0))
            pygame.display.flip()
            pygame.time.wait(100)
            pygame.display.quit()
            pygame.quit()
            sys.exit()
        #print(andarei)
        if self.estado == 'andando':
            if self.direcao == 'dir':
                    player.bx += andarei//2
            if self.direcao == 'esq':
                    player.bx -= andarei//2
            if self.direcao == 'cima':
                    player.by -= andarei//2
            if self.direcao == 'baixo':
                    player.by += andarei//2
      
            for i in range(32):
                if self.direcao == 'dir':
                    player.x += andarei
                if self.direcao == 'esq':
                    player.x -= andarei
                if self.direcao == 'cima':
                    player.y -= andarei
                if self.direcao == 'baixo':
                    player.y += andarei
                self.desenha()
            self.estado = 'parado'

    def usar(self,magic):
        
        self.magia = magic
        self.estado = 'usando_magia'
        prox_bloco = ''
        if self.direcao == 'dir':
            prox_bloco = ((11*(2*(player.by))) + (player.bx+1)*2)
        if self.direcao == 'esq':
            prox_bloco = ((11*(2*(player.by))) + (player.bx-1)*2)
        if self.direcao == 'cima':
            prox_bloco = ((11*(2*(player.by-1))) + (player.bx)*2)
        if self.direcao == 'baixo':
            prox_bloco = ((11*(2*(player.by+1))) + (player.bx)*2)
        for i in range(15):
            self.desenha()
            
        self.estado = 'parado'
        self.desenha()
        att_matrix(magic,prox_bloco)
            
    def virar(self):
        if self.direcao == 'dir':
            self.direcao = 'baixo'
        elif self.direcao == 'baixo':
            self.direcao = 'esq'
        elif self.direcao == 'esq':
            self.direcao = 'cima'
        elif self.direcao == 'cima':
            self.direcao = 'dir'
        player.desenha()
        
    def esquerda(self):
        player.virar()
        player.virar()
        player.virar()
#def perguntar():

    
close = False
player = Player()
player.desenha()
pygame.time.wait(1000)

player.andar()
player.usar("fisico")
player.andar()
player.andar()
player.andar()
player.usar("fisico")
player.andar()
player.esquerda()
#player.usar("agua")
player.andar()
pygame.time.wait(10000)
pygame.quit()
# # #   MAIN    # # #
#while not close:
#    for event in pygame.event.get():
#        if event.type == pygame.QUIT:
#            close = True




