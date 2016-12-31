import pygame, sys
pygame.init()


# # #   Inicializar # # #
screen = pygame.display.set_mode ((900,650))
pygame.display.set_caption('Jogo')
clock = pygame.time.Clock()


# # #   Carregar imagens    # # #
bg = pygame.image.load('src/t3/Imagem/forst.png')
fim = pygame.image.load('src/t3/Imagem/fim.png')
grama = pygame.image.load('src/t3/Imagem/grama.png')
pedra = pygame.image.load('src/t3/Imagem/pedra.png') # 1
caixa = pygame.image.load('src/t3/Imagem/caixa.png') # c - Mapeamento na matriz da fase
caixa_quebrada = pygame.image.load('src/t3/Imagem/caixa_quebrada.png') # q
fogueira = [pygame.image.load('src/t3/Imagem/fogueira2.png'),pygame.image.load('src/t3/Imagem/fogueira3.png'),pygame.image.load('src/t3/Imagem/fogueira4.png')] # f
f_apagada = pygame.image.load('src/t3/Imagem/fogueira1.png') # a
arvore = pygame.image.load('src/t3/Imagem/arvore.png') # r
a_queimada = pygame.image.load('src/t3/Imagem/a_queimada.png') # v
tronco = pygame.image.load('src/t3/Imagem/tronco.png') # t
portal = [pygame.image.load('src/t3/Imagem/portal1.png'),pygame.image.load('src/t3/Imagem/portal2.png'),
          pygame.image.load('src/t3/Imagem/portal3.png'),pygame.image.load('src/t3/Imagem/portal4.png'),
          pygame.image.load('src/t3/Imagem/portal5.png'),pygame.image.load('src/t3/Imagem/portal6.png'),
          pygame.image.load('src/t3/Imagem/portal7.png'),pygame.image.load('src/t3/Imagem/portal8.png')] # p
anima_fogo = 0
anima_portal = 0

# # #   Ler o arquivo/fase  # # #
arquivo = open('src/t3/Fase/mapa1.txt', 'r')
matriz = arquivo.read()
lmatriz = list(matriz)


# # #   Usar magias em objetos do mapa    # # #
def att_matriz(magia, prox_bloco):
    if(magia == "fogo" and lmatriz[prox_bloco] == 'c'): # Fogo na caixa
        lmatriz[prox_bloco] = 'q'
    elif(magia == "fogo" and lmatriz[prox_bloco] == 'r'): # Fogo na arvore
        lmatriz[prox_bloco] = 'v'
    elif(magia == "fogo" and lmatriz[prox_bloco] == 'a'): # Fogo na fogueira apagada
        lmatriz[prox_bloco] = 'f'
    elif(magia == "agua" and lmatriz[prox_bloco] == 'f'): # Agua na fogueira
        lmatriz[prox_bloco] = 'a'
    elif(magia == "agua" and lmatriz[prox_bloco] == 't'): # Agua no tronco
        lmatriz[prox_bloco] = 'r'
    elif(magia == "ataque" and lmatriz[prox_bloco] == 'r'): # ataque na arvore
        lmatriz[prox_bloco] = 't'
    elif(magia == "ataque" and lmatriz[prox_bloco] == 'c'): # ataque na caixa
        lmatriz[prox_bloco] = 'q'


# # #  Desenhar o mapeamento da fase  # # #
def mapa():
    screen.blit(bg, (0, 0))
    x = 1
    y = 1
    aux = []
    auy = []
    cont = 1

    # Ignorar espacos em branco e "pular linha" do arquivo
    for i in lmatriz:
        if(i == ' ' or i == '\n'):
            continue

        # Desenha os elementos do cenario de acordo com o mapeamento da matriz
        screen.blit(grama, (x+100,y+100))
        if(i == '1'):
            screen.blit(pedra, (x+100,y+100))
        elif(i == 'c'):
            screen.blit(caixa, (x+100,y+100))
        elif(i == 'q'):
            screen.blit(caixa_quebrada, (x+100,y+100))
        elif(i == 'v'):
            screen.blit(a_queimada, (x+100,y+90))
        elif(i == 'f'):
            global anima_fogo
            screen.blit(fogueira[int(anima_fogo)], (x+100,y+100))
            anima_fogo += 0.2
            if(anima_fogo >=3):
                 anima_fogo = 0
        elif(i == 'p'):
            global anima_portal
            screen.blit(portal[int(anima_portal)], (x+100,y+100))
            screen.blit(portal[int((anima_portal+3)%7 +1)], (x+100,y+100))
            anima_portal += 0.3
            if(anima_portal >= 8):
                 anima_portal = 1
        elif(i == 'a'):
            screen.blit(f_apagada, (x+100,y+100))
        elif(i == 'r'):
            screen.blit(arvore, (x+90,y+30))
            aux.append(x+90)
            aux.append(y+30)
        elif(i == 't'):
            screen.blit(tronco, (x+100,y+100))

        # Imprimir os desenhos da matriz por linha
        x += 64
        if(cont % 11 == 0):
            y += 67
            x = 0
        cont += 1
    return aux


# # #   Jogador # # #
class Player():

    def __init__(self):
        # Posicao do mapa na tela x: 110 y: 98
        self.bx = 0
        self.by = 2
        self.x = 110 + (self.bx*64)
        self.y = 98 + (self.by*67)
        self.bloco = ((11*(2*(self.by))) + self.bx*2) # Equacao para identificar o bloco em que o jogador esta
        self.imga_dir = [pygame.image.load('src/t3/Imagem/p_dir1.png'),
                    pygame.image.load('src/t3/Imagem/p_dir2.png'),
                    pygame.image.load('src/t3/Imagem/p_dir3.png'),
                    pygame.image.load('src/t3/Imagem/p_dir2.png'),
                    pygame.image.load('src/t3/Imagem/p_dir1.png')]
        self.imga_esq = [pygame.image.load('src/t3/Imagem/p_esq1.png'),
                    pygame.image.load('src/t3/Imagem/p_esq2.png'),
                    pygame.image.load('src/t3/Imagem/p_esq3.png'),
                    pygame.image.load('src/t3/Imagem/p_esq2.png'),
                    pygame.image.load('src/t3/Imagem/p_esq1.png')]
        self.imga_cima = [pygame.image.load('src/t3/Imagem/p_cima1.png'),
                    pygame.image.load('src/t3/Imagem/p_cima2.png'),
                    pygame.image.load('src/t3/Imagem/p_cima3.png'),
                    pygame.image.load('src/t3/Imagem/p_cima2.png'),
                    pygame.image.load('src/t3/Imagem/p_cima1.png')]
        self.imga_baixo = [pygame.image.load('src/t3/Imagem/p_frente1.png'),
                    pygame.image.load('src/t3/Imagem/p_frente2.png'),
                    pygame.image.load('src/t3/Imagem/p_frente3.png'),
                    pygame.image.load('src/t3/Imagem/p_frente2.png'),
                    pygame.image.load('src/t3/Imagem/p_frente1.png')]
        self.magic_fogo = [pygame.image.load('src/t3/Imagem/fogo1.png'),
                    pygame.image.load('src/t3/Imagem/fogo2.png'),
                    pygame.image.load('src/t3/Imagem/fogo3.png'),
                    pygame.image.load('src/t3/Imagem/fogo4.png'),
                    pygame.image.load('src/t3/Imagem/fogo5.png'),
                    pygame.image.load('src/t3/Imagem/fogo6.png'),
                    pygame.image.load('src/t3/Imagem/fogo7.png'),
                    pygame.image.load('src/t3/Imagem/fogo8.png')]
        self.magic_agua = [pygame.image.load('src/t3/Imagem/agua1.png'),
                    pygame.image.load('src/t3/Imagem/agua2.png'),
                    pygame.image.load('src/t3/Imagem/agua3.png'),
                    pygame.image.load('src/t3/Imagem/agua4.png'),
                    pygame.image.load('src/t3/Imagem/agua5.png'),
                    pygame.image.load('src/t3/Imagem/agua6.png'),
                    pygame.image.load('src/t3/Imagem/agua7.png'),
                    pygame.image.load('src/t3/Imagem/agua8.png')]
        self.magic_ataque = [pygame.image.load('src/t3/Imagem/atk1.png'),
                    pygame.image.load('src/t3/Imagem/atk2.png'),
                    pygame.image.load('src/t3/Imagem/atk3.png'),
                    pygame.image.load('src/t3/Imagem/atk4.png'),
                    pygame.image.load('src/t3/Imagem/atk5.png'),
                    pygame.image.load('src/t3/Imagem/atk6.png'),
                    pygame.image.load('src/t3/Imagem/atk7.png'),
                    pygame.image.load('src/t3/Imagem/atk8.png')]

        self.animacao = 0
        self.direcao = 'dir' # dir, esq, cima, baixo
        self.estado = 'andando' # andando, parado, usando_magia
        self.magia = 'fogo' # agua, fogo, ataque
        self.anima_magia = 0

    # # # Desenhar o jogador/animacoes do jogador e das magias na tela    # # #
    def desenha(self):
        aux = mapa()
        magicx = self.x
        magicy = self.y

        # Jogador virando
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

        # Jogador andando
        if self.estado == 'andando':
            self.animacao += 0.5
            if self.animacao >= 5:
                self.animacao = 0

        # Jogador passando atras da arvore
        for i in range(0,len(aux),2):
            screen.blit(arvore, (aux[i],aux[i+1] ))

        # Jogador usando magias no bloco a frente
        if self.estado == 'usando_magia':
            if self.magia == 'fogo':
                screen.blit(self.magic_fogo[int(self.anima_magia)], (magicx-4, magicy))
            if self.magia == 'agua':
                screen.blit(self.magic_agua[int(self.anima_magia)], (magicx-8+self.anima_magia, magicy-5))
            if self.magia == 'ataque':
                screen.blit(self.magic_ataque[int(self.anima_magia)], (magicx, magicy))

            self.anima_magia += 0.5
            if self.anima_magia >= 8:
                self.anima_magia = 0

        clock.tick(40)
        pygame.display.flip()

    # # #   Animacao do jogador em movimento usando a equacao para identificar posicao  # # #
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

        # Detecta colisao ao andar
        andarei = 2
        # Fim do jogo quando:
        #   Jogador anda em cima do fogo
        #   Jogador ultrapassa limite do mapa
        finaliza = False
        print(self.y)
        if (self.x > 750 or self.y < 60 or self.y > 510):
            player.bloco = 0
            finaliza = True
            print(finaliza)
        if (lmatriz[player.bloco] == "f" or finaliza == True):
            screen.blit(bg, (0, 0))
            screen.blit(fim, (100, 100))
            pygame.time.wait(500)
            pygame.display.flip()
            pygame.display.quit()
            pygame.quit()
            sys.exit()
        # Quando o bloco esta livre, anda
        elif (lmatriz[player.bloco] == "0"):
            andarei = 2
        # Quando o bloco esta com obstaculo, para
        elif (lmatriz[player.bloco] == "1" or lmatriz[player.bloco] == "c"  or lmatriz[player.bloco] == "r" or lmatriz[player.bloco] == "v"):
            andarei = 0
        # Quando o jogador entra no portal
        elif lmatriz[player.bloco] == "p":
           print('Ganhou')
        else:
            andarei = 2


        # Andando por bloco
        if self.estado == 'andando':
            if self.direcao == 'dir':
                    player.bx += andarei//2
            if self.direcao == 'esq':
                    player.bx -= andarei//2
            if self.direcao == 'cima':
                    player.by -= andarei//2
            if self.direcao == 'baixo':
                    player.by += andarei//2

            # Andando pela posicao x e y
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


    # # #   Usa magia no proximo bloco  # # #
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
        att_matriz(magic, prox_bloco)


    # # #   Vira o jogador sempre para a direita    # # #
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



close = False
player = Player()
player.desenha()

# # #   Leitura dos comandos gerados pelo compilador    # # #
cmd = open('src/t3/codigoGerado.txt', 'r')
line = cmd.readline()
frente ='fogo'
print(line)
while line:
    exec(line)
    line = cmd.readline()
    print(line)
player.estado = 'parado'
player.desenha()

# # #   Fechar a tela apos fim da execucao  # # #
while not close:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            close = True

pygame.display.quit()
pygame.quit()
sys.exit()
