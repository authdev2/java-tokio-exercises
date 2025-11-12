// ============================================
// EXEMPLOS EM TYPESCRIPT
// ============================================

// Exemplo 1: setTimeout com tipos
function tickTockCallbacks(): void {
    let isTick: boolean = true;
    
    function print(): void {
        if (isTick) {
            console.log("Tick");
        } else {
            console.log("Tock");
        }
        isTick = !isTick;
        setTimeout(print, 1000);
    }
    
    print();
}

// Exemplo 2: Promises com tipos
function delay(ms: number): Promise<void> {
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function tickTockAsync(): Promise<void> {
    while (true) {
        console.log("Tick");
        await delay(1000);
        console.log("Tock");
        await delay(1000);
    }
}

// Exemplo 3: Callback tipado
type Callback = (result: string) => void;

function fazerAlgoAssincrono(callback: Callback): void {
    setTimeout(() => {
        callback("Sucesso!");
    }, 1000);
}

// Exemplo 4: Promise tipada
function fazerAlgoComPromise(): Promise<string> {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Sucesso!");
        }, 1000);
    });
}

// Exemplo 5: Async/Await com tipos
async function exemploAsync(): Promise<string> {
    const resultado = await fazerAlgoComPromise();
    return resultado;
}

// Exemplo 6: Função com callback opcional
function processarDados(
    dados: number[], 
    callback?: (result: number) => void
): void {
    const resultado = dados.reduce((acc, val) => acc + val, 0);
    if (callback) {
        callback(resultado);
    }
}

// Exemplo 7: Promise com tratamento de erro
async function buscarDados(): Promise<string> {
    try {
        // Simula uma requisição HTTP
        const resposta = await fetch('https://api.exemplo.com/dados');
        return await resposta.json();
    } catch (erro) {
        throw new Error(`Erro ao buscar dados: ${erro}`);
    }
}

// Exemplo 8: Múltiplas promises em paralelo
async function buscarMultiplosDados(): Promise<string[]> {
    const promisses = [
        fetch('https://api.exemplo.com/dados1').then(r => r.json()),
        fetch('https://api.exemplo.com/dados2').then(r => r.json()),
        fetch('https://api.exemplo.com/dados3').then(r => r.json())
    ];
    
    // Executa todas em paralelo e espera todas completarem
    return Promise.all(promisses);
}

// Exemplo 9: Race condition - primeira que completar
async function primeiraResposta(): Promise<string> {
    const promisses = [
        fetch('https://api.lenta.com').then(r => r.json()),
        fetch('https://api.rapida.com').then(r => r.json())
    ];
    
    // Retorna a primeira que completar
    return Promise.race(promisses);
}

