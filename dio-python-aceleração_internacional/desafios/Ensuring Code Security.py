def perform_login(registered_user, username, password):
    if registered_user["username"] != username:
        return f'User {username} not found. Access denied.'

    if registered_user["password"] != password:
        return f'Incorrect password for {username}. Access denied.'

    return f'Access granted for {username}.'

# Main function of the program
def main():
    # Asking for the registered username
    registered_username = str(input())
    # Asking for the registered password
    registered_password = str(input())
    
    # Creating a dictionary containing the information of the registered user
    registered_user = {"username": registered_username, "password": registered_password}
    
    # Asking for the username to attempt login
    login_username_attempt = str(input())
    # Asking for the password to attempt login
    login_password_attempt = str(input())
    
    # Calling the perform_login function to check login and get the result
    result = perform_login(registered_user, login_username_attempt, login_password_attempt)
    
    # Printing the result of the login process
    print(result)

# Checking if the script is being executed as the main program
if __name__ == "__main__":
    # Calling the main function to initiate the login process
    main()