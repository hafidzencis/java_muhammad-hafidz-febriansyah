# 28_Unit Testing

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi Unit Testing <br />
2. Concern dan Benefit dari Unit Testing<br />
3. F.I.R.S.T. dalam principle unit testing <br />

### Definisi Unit Testing

Unit testing is a level of the software testing process where
individual units/components of a software/system are
tested.<br />
Units are the smallest testable parts of a application.<br />
The purpose is to validate that each unit of the software
performs as designed

### Concern dan Benefit dari Unit Testing

- Unit Testing Concern : <br/>
  -> Functional correctness and completeness <br/>
  -> Error handling <br/>
  -> Checking input values (parameter) <br/>
  -> Correctness of output data (return values) <br/>
  -> Optimizing algorithm and performance <br/><br />

- Unit Testing Benefits : <br />
  -> Quality of Code <br />
  -> Finds Software Bugs Early <br />
  -> Faster Development <br />
  -> Better Design Reduce Costs <br />

### F.I.R.S.T. dalam principle unit testing

- F ast<br />
  • Unit tests are small pieces of code that perform one, specific task.
  • Because unit tests are small, and unlike integration tests, unit tests do not communicate over the network and do not perform database operations.
  • Because unit tests do not communicate with remote servers or databases, they run very fast.
  • Because unit tests is fast, use this to test all branching of the codebase
  <br /><br />

- I solated/Independent <br />
  • Unit tests must be independent of each other. <br />
  • One unit test should not depend on the result produced by another unit test. In fact, most of the time, unit tests are run in a randomized order. <br />
  • The code you are testing or the system under test should also be isolated from its dependencies. <br />
  • Because of the random independent order, we can also run them in parallel to increase test speed <br /><br />

- R epeatable<br />
  • A unit test should be repeatable and if run multiple times should produce the same result. If a unit test is run on a different computer it should also produce the same result. <br />
  • This is why unit tests are made independent of the environment and from other unit tests. <br />
  • Be careful with Date / Time related functionality <br /><br />

- S elf Validating<br />
  • To learn if a unit test has passed or not, the developer should not do any additional manual checks after the test completes <br />
  • Add as many assertion as possible <br />
  • Verify the arguments called to the dependencies, don't just check that it is called or not called <br /><br />

- T horough / Completeness<br />
  • We should consider a happy path as well as a negative scenario. <br />
  • Create multiple unit tests to test a function that accepts different input parameters, valid and invalid one <br />
  • Write a self-documenting method name or scenario descriptions <br />
  • If you are practicing TDD, timely will mean write tests before writing the code <br />
  • But most of the time it's not practical, instead write tests before submitting a PR for new code <br />
  • Add tests to old code as soon as possible, don't neglect writing tests after-hand <br /><br />

## Task

### Task 1

Problem - Business Logic Layer Testing <br />
Dari praktikum pada materi Springboot NoSOL, lakukan unit test pada bagian service! Minimum 3 test case.

1.  SS ProductServiceTest<br />

![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/28_Unit%20Testing/screenshot/productservicetestkoding.JPG)<br /><br />

- Hasil dari Test Create New Product<br />
  ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/28_Unit%20Testing/screenshot/testcreatenewproduct.JPG)<br /><br />
- Hasil dari Test Update New Product<br />
  ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/28_Unit%20Testing/screenshot/testupdatenewproduct.JPG)<br /><br />

2. SS ProductServiceTest<br />

![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/28_Unit%20Testing/screenshot/transactionservicetestkoding.JPG)<br /><br />

- Hasil dari Test Create New Transaction<br />
  ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/28_Unit%20Testing/screenshot/testcreatenewtrannsaction.JPG)<br /><br />
