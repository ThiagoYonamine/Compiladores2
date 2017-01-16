base = open('code.py', 'r')
cmd = open('codigoGerado.txt', 'r')

texto_base = base.read()
texto_cmd= cmd.read()

texto_cmd += "gameOver()"
codigo = texto_base + texto_cmd
jogo = open('jogo.py', 'w')
jogo.write(codigo)

base.close()
cmd.close()
