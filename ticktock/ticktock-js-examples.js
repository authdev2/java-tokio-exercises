// ============================================
// EXEMPLO 1: setTimeout e Callbacks (equivalente básico)
// ============================================

console.log("=== Exemplo 1: setTimeout com Callbacks ===");

function tickTockWithCallbacks() {
    let isTick = true;
    
    function print() {
        if (isTick) {
            console.log("Tick");
        } else {
            console.log("Tock");
        }
        isTick = !isTick;
        
        // Agenda a próxima execução após 1 segundo
        setTimeout(print, 1000);
    }
    
    // Inicia
    print();
}

// tickTockWithCallbacks(); // Descomente para testar


// ============================================
// EXEMPLO 2: Promises (mais moderno)
// ============================================

console.log("\n=== Exemplo 2: Promises ===");

function delay(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function tickTockWithAsync() {
    while (true) {
        console.log("Tick");
        await delay(1000);
        console.log("Tock");
        await delay(1000);
    }
}

// tickTockWithAsync(); // Descomente para testar


// ============================================
// EXEMPLO 3: setInterval (mais simples)
// ============================================

console.log("\n=== Exemplo 3: setInterval ===");

function tickTockWithInterval() {
    let isTick = true;
    
    setInterval(() => {
        if (isTick) {
            console.log("Tick");
        } else {
            console.log("Tock");
        }
        isTick = !isTick;
    }, 1000);
}

// tickTockWithInterval(); // Descomente para testar


// ============================================
// EXEMPLO 4: Callback Hell (não recomendado, mas comum)
// ============================================

console.log("\n=== Exemplo 4: Callback Hell ===");

function fazerAlgoAssincrono(callback) {
    setTimeout(() => {
        console.log("Operação assíncrona completa!");
        callback();
    }, 1000);
}

function exemploCallbackHell() {
    fazerAlgoAssincrono(() => {
        console.log("Primeiro callback");
        fazerAlgoAssincrono(() => {
            console.log("Segundo callback");
            fazerAlgoAssincrono(() => {
                console.log("Terceiro callback");
                // Isso vira uma "pirâmide" difícil de ler!
            });
        });
    });
}

// exemploCallbackHell();


// ============================================
// EXEMPLO 5: Promises (melhor que callbacks)
// ============================================

console.log("\n=== Exemplo 5: Promises (melhor) ===");

function fazerAlgoAssincronoComPromise() {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log("Operação assíncrona completa!");
            resolve("Sucesso!");
        }, 1000);
    });
}

function exemploComPromises() {
    fazerAlgoAssincronoComPromise()
        .then((resultado) => {
            console.log("Primeiro:", resultado);
            return fazerAlgoAssincronoComPromise();
        })
        .then((resultado) => {
            console.log("Segundo:", resultado);
            return fazerAlgoAssincronoComPromise();
        })
        .then((resultado) => {
            console.log("Terceiro:", resultado);
        });
}

// exemploComPromises();


// ============================================
// EXEMPLO 6: Async/Await (mais moderno e limpo)
// ============================================

console.log("\n=== Exemplo 6: Async/Await (melhor ainda) ===");

async function exemploComAsyncAwait() {
    const resultado1 = await fazerAlgoAssincronoComPromise();
    console.log("Primeiro:", resultado1);
    
    const resultado2 = await fazerAlgoAssincronoComPromise();
    console.log("Segundo:", resultado2);
    
    const resultado3 = await fazerAlgoAssincronoComPromise();
    console.log("Terceiro:", resultado3);
}

// exemploComAsyncAwait();


// ============================================
// EXEMPLO 7: Web Workers (paralelismo real - Browser)
// ============================================

console.log("\n=== Exemplo 7: Web Workers (Browser) ===");
console.log("Web Workers permitem paralelismo real no browser:");
console.log(`
// worker.js
self.onmessage = function(e) {
    const resultado = processarDados(e.data);
    self.postMessage(resultado);
};

// main.js
const worker = new Worker('worker.js');
worker.postMessage(dados);
worker.onmessage = function(e) {
    console.log('Resultado:', e.data);
};
`);


// ============================================
// EXEMPLO 8: Worker Threads (Node.js)
// ============================================

console.log("\n=== Exemplo 8: Worker Threads (Node.js) ===");
console.log("No Node.js, você pode usar worker_threads:");
console.log(`
const { Worker } = require('worker_threads');

const worker = new Worker(\`
    const { parentPort } = require('worker_threads');
    parentPort.on('message', (dados) => {
        const resultado = processar(dados);
        parentPort.postMessage(resultado);
    });
\`);

worker.postMessage(dados);
worker.on('message', (resultado) => {
    console.log('Resultado:', resultado);
});
`);

