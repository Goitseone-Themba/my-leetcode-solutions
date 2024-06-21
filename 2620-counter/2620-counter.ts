function createCounter(n: number): () => number {
    
    return function() {
        const res: number = n
        n = n + 1
        return res
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */