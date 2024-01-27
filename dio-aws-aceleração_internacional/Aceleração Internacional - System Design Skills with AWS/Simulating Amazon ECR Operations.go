package main

import (
	"fmt"
)

// Repository represents a repository in Amazon ECR
type Repository struct {
	Name string
}

// AWSClient simulates an AWS client to interact with ECR (for example purposes)
type AWSClient struct {
}

// ListRepositories lists existing repositories (simulation)
func (c *AWSClient) ListRepositories() []Repository {
	// Simulating existing repositories
	return []Repository{
		{Name: "repo1"},
		{Name: "repo2"},
	}
}

// CreateRepository creates a new repository (simulation)
func (c *AWSClient) CreateRepository(name string) {
	// Simulating the creation of a new repository
	fmt.Printf("New repository created successfully: %s\n", name)
}

// RemoveRepository removes an existing repository (simulation)
func (c *AWSClient) RemoveRepository(name string) {
	// Simulating the removal of a repository
	fmt.Printf("Repository removed: %s\n", name)
}

func main() {
	awsClient := &AWSClient{}

	for {
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			repositories := awsClient.ListRepositories()
			fmt.Println("Existing repositories:")
			for _, repo := range repositories {
				fmt.Println(repo.Name)
			}

        case 2:
            var repoName string
            fmt.Scan(&repoName)
            awsClient.CreateRepository(repoName)

        case 3:
            var repoName string
            fmt.Scan(&repoName)
            repositories := awsClient.ListRepositories()
            for _, repo := range repositories {
				if repo.Name == repoName {
                    awsClient.RemoveRepository(repoName)
                }
			}
        
        case 4:
            fmt.Print("Exiting the program.\n")
            fmt.Print("Goodbye!\n")

		default:
			fmt.Println("Invalid choice. Please try again.")
		}
	}
}