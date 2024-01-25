package main

import "fmt"

func main() {
    // Define the rates
    costPerHourEC2 := 0.25
    costPerGBS3 := 0.05

    // Collecting user information
    var numOfEC2Instances, numOfGBS3, numberOfMonths int

    fmt.Scan(&numOfEC2Instances)

    fmt.Scan(&numOfGBS3)

    fmt.Scan(&numberOfMonths)

    var resultEC2, resultS3, resultAll float64

    resultEC2 = float64(numOfEC2Instances) * costPerHourEC2
    resultS3 = float64(numOfGBS3) * float64(numberOfMonths) * costPerGBS3
    resultAll = resultEC2 + resultS3

    fmt.Print("Estimated total cost:\n")
    fmt.Printf("EC2: $%.2f\n", resultEC2)
    fmt.Printf("S3: $%.2f\n", resultS3)
    fmt.Printf("Total cost: $%.2f\n", resultAll)
}