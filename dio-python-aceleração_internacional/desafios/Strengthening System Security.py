def authenticate(username, password, auth_code, login_username, login_password, provided_auth_code):
    
    registered_user = {"username": username, "password": password}

    if registered_user["username"] != login_username:
        return f'User {login_username} not found. Access denied.'

    if registered_user["password"] != login_password:
        return f'Incorrect password for {login_username}. Access denied.'

    if auth_code != provided_auth_code:
        return f'Incorrect authentication code for {login_username}. Access denied. '

    return f'Access granted for {login_username}.'


def main():
    # User information registration
    username = input()
    password = input()
    
    # Authentication code setup
    auth_code = input()
    
    # Login attempt
    login_username = input()
    login_password = input()
    
    # Provided authentication code input
    provided_auth_code = input()
    
    # Authenticate with provided authentication code
    result = authenticate(username, password, auth_code, login_username, login_password, provided_auth_code)  
    print(result)

if __name__ == "__main__":
    main()