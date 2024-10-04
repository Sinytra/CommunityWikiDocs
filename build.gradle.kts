plugins {
    id("org.sinytra.wiki.toolkit") version "0.1.10"
}

val documentation_roots: String by project

val roots = documentation_roots.split(",").filter(String::isNotEmpty)

wiki {
    docs {
        roots.forEach { name ->
            create(name) {
                root = file(name)
            }
        }
    }
}
