class RandomQueueSelector {
    Queue queue1, queue2, queue3, queue4, queue5;

    public RandomQueueSelector(Queue queue1, Queue queue2, Queue queue3, Queue queue4, Queue queue5) {
        this.queue1 = queue1;
        this.queue2 = queue2;
        this.queue3 = queue3;
        this.queue4 = queue4;
        this.queue5 = queue5;
    }

    public Queue getRandomQueue() {
        long seed = System.currentTimeMillis(); // Menggunakan waktu sistem sebagai seed
        long randomValue = (seed % 5) + 1; // Menghasilkan angka 1, 2, 3, 4, atau 5

        if (randomValue == 1) {
            return queue1;
        } else if (randomValue == 2) {
            return queue2;
        } else if (randomValue == 3) {
            return queue3;
        } else if (randomValue == 4) {
            return queue4;
        } else {
            return queue5;
        }
    }
}