[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10220404)

# Практична робота "Масиви, вирази, керування виконанням програми"

## Результат виконання завдання


## Умова завдання

**13.** Перевірте чи є задане число числом Армстронга.

## Завдання №1. Внесення змін до стартового коду

1. Код класу **"Exercise"** -

```java
package domain;

public class Exercise {
    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return (number == sum);
    }
}
```

2. Код класу **"TestResult"** -

```java
package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int number = 153;
        boolean result = Exercise.isArmstrong(number);

        if (result) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
```

3. Результати працюючого коду -

<img src="https://github.com/ppc-ntu-khpi/java-arrays-MargoBB/blob/master/src/1.png">

[![Gitter](https://badges.gitter.im/PPC-SE-2020/OOP.svg)](https://gitter.im/PPC-SE-2020/OOP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

