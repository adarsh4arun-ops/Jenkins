class BankAccount:
    def __init__(self, initial_balance):
        if initial_balance < 0:
            raise ValueError("Initial balance cannot be negative")
        self.balance = initial_balance

    def deposit(self, amount):
        if amount <= 0:
            raise ValueError("Deposit must be positive")
        self.balance += amount

    def withdraw(self, amount):
        if amount <= 0 or amount > self.balance:
            raise ValueError("Invalid withdrawal")
        self.balance -= amount

    def get_balance(self):
        return self.balance


# Main
acc = BankAccount(500000)
print("Initial Balance:", acc.get_balance())

acc.deposit(7000)
print("Balance after deposit:", acc.get_balance())

acc.withdraw(100)
print("Balance after withdrawal:", acc.get_balance())

print("Final Balance:", acc.get_balance())
