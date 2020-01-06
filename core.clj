(ns learning.core)

(def not-divisible? (comp not zero? mod))
(def prime? (comp
              (partial every? (comp
                                (partial apply not-divisible?)))
              (partial drop 2)
              (partial apply map vector)
              (juxt (partial repeat) (partial range 2))))

(println (prime? 25))