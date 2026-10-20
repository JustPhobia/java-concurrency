# java-concurrency

Eight small multithreading / concurrency demos from the threads stage of
learning Java — each in its own package under `src/Module3/Threads/`.

> Built within my first ~4–5 months of learning Java (a coding course). Kept as a record of progress, not as polished production code.

## Demos
- `bank-account-management` — synchronized account access (`BankSystem`)
- `coffee-machine-order-processor` — producer/consumer coffee orders (`Barista`)
- `conveyor-belt` — workers adding/removing on a belt (`Output`)
- `plant-care-system` — background plant-degradation threads (`PlantCareAssistant`)
- `producer-consumer` — classic producer/consumer (`ProducerConsumer`)
- `related-async` — increment/decrement threads on a shared counter (`Counter`)
- `synchronized-numbers` — alternating even/odd printing (`NumberPrinter`)
- `unrelated-async` — independent async tasks (`AsynchronousMain`)

## Run (example)
```bash
find src -name '*.java' | xargs javac -d out
java -cp out Module3.Threads.ConveyorBeltProblem.Output
```

## Fixes / flags
- Renamed `evenThread`/`oddThread` to `EvenThread`/`OddThread` (Java naming).
- `plant-care-system` bundles its own copy of `UtilClass` (it originally reached
  into another module).
- Known rough edges: `NumberPrinter` can hang after the first few numbers, and
  `ProducerConsumer` runs continuously — early concurrency experiments with
  imperfect termination.
