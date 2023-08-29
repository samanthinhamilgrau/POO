//posições dos carros
// let xMobs1 = 600;
// let xMobs2 = 600;
// let xMobs3 = 600;
let xMobs = [700,700,700,700,700,700]
let yMobs = [33, 100, 150, 200, 250, 300]
let velocidadeMobs = [2,3.2,2.6,3.3,4.2,5]
let larguraMobs=50;
let alturaMobs=30;

function movimentoMobs() {

    for (let i = 0; i < imagensMobs.length; i++) {

        xMobs[i] -= velocidadeMobs[i];
        
    }
}

function mostrarMobs() {

    for (let i = 0; i < imagensMobs.length; i++) {

        image(imagensMobs[i], xMobs[i], yMobs[i], larguraMobs, alturaMobs )

        if (xMobs[i] < -50) {
            xMobs[i] = 700
        }
        
    }

    // image(imagemMob1, xMobs1, 50, larguraMobs, alturaMobs)
    // image(imagemMob2, xMobs2, 100, larguraMobs, alturaMobs)
    // image(imagemMob3, xMobs3, 160, larguraMobs, alturaMobs)
}