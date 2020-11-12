package Association;

class Job {
    String role, description;

    Job(String role, String description) {
        this.role = role;
        this.description = description;
    }

    void display() {
        System.out.println("Works as a " + role + " : " + description);
    }
}
