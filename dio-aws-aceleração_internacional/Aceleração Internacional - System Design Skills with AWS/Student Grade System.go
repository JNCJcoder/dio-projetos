package main

import (
	"fmt"
)

// Student represents the data structure of a student
type Student struct {
	ID    int
	Name  string
	Grades []float64
}

// NewStudent creates an instance of a student with a unique ID
func NewStudent(name string) Student {
	return Student{
		ID:    len(students) + 1,
		Name:  name,
		Grades: []float64{},
	}
}

// AddGrade adds a grade to the student
func (s *Student) AddGrade(grade float64) {
	s.Grades = append(s.Grades, grade)
}

// CalculateAverage calculates the average of the student's grades
// TODO: Implement the logic to calculate the average of the grades.
//       If the student has no grades, return 0.
func (s *Student) CalculateAverage() float64 {
	// TODO: Add the logic here
	if len(s.Grades) == 0 {
		return 0
	}

	result := 0.00

	for index := 0; index < len(s.Grades); index++ {
        result += s.Grades[index]
    }

	return float64(result / float64(len(s.Grades)))
}

// GenerateGradeReport generates a report of the student's grades
func (s *Student) GenerateGradeReport() string {
	average := s.CalculateAverage()
	return fmt.Sprintf("Name: %s\nGrades: %v\nAverage: %.2f", s.Name, s.Grades, average)
}

var students []Student

func main() {
	// Receive grades via input
	var studentName string

	fmt.Scan(&studentName)

	student := NewStudent(studentName)

	for {

		var grade float64
		fmt.Scan(&grade)

		if grade == -1 {
			break
		}

		student.AddGrade(grade)
	}

	students = append(students, student)

	// Display grade report
	for _, student := range students {
		fmt.Println(student.GenerateGradeReport())
	}
}