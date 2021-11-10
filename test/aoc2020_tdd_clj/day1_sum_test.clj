(ns aoc2020-tdd-clj.day1-sum-test
  (:require [clojure.test :refer :all]
            [aoc2020-tdd-clj.day1-sum :refer :all]))

(def ^:private test-data [1721 979 366 299 675 1456])

(deftest find-addends
  (testing "addends"
    (is (= [[1721 299]] (addend-pairs 2020 test-data)))))

