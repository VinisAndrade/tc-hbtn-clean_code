public class Functions {

    // Faça somente 1 coisa
    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    // Somente 1 nível de abstração
    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.save(user);
    }

    // No side effects
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void setRole(User user) {
        user.setRole(user);
    }

    // Evite duplicados, extraindo para novos métodos
    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }
}
