let yMascote = 330;
let xMascote = 70;
let meusPontos = 0
let colisao = false;

function incluirPontos() {
    
    text(meusPontos,20,25 )
    fill(color(0, 0, 0))
    textSize(21)

    if (yMascote < 0) {
        yMascote = 360
        meusPontos ++
        
    }
}

function movimentoMascote() {

    if (keyIsDown(UP_ARROW)) {
        
        yMascote -=5;
    }

    if (keyIsDown(DOWN_ARROW)){
        
        yMascote +=5;
    }

    if (keyIsDown(LEFT_ARROW)) {
        
        xMascote -=5;

        imagemDoMascote = loadImage("img/mascote - esquerda.png");
    }

    if (keyIsDown(RIGHT_ARROW)) {
        
        xMascote +=5;

        imagemDoMascote = loadImage("img/mascote.png");
    }
}

function mostrarMascote() {

    image(imagemDoMascote, xMascote, yMascote, 80, 80);
    
}



function verificaColisao() {

    for (let i = 0; i < imagensMobs.length; i++) {

        colisao = collideRectCircle(xMobs[i], yMobs[i], larguraMobs, alturaMobs, xMascote, yMascote, 25)
        if (colisao) {
            voltaPontoInicial();
            if (meusPontos > 0) {
                meusPontos -= 1;
            }
        }
    }

    
    print('Colisão acontecendo', colisao);
}

function voltaPontoInicial() {
    yMascote = 330; 
}


