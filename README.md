# VariousCards   `1.0.1`

Sendiko's custom composable that create a beautiful card with icons, title, and text content!

## Add it to your projects

in libs.versions.toml add:

```toml
 [versions]
 variousCards = "1.0.1
```

```toml
 [libraries]
 various-cards = { module = "com.github.Sendiko:various-cards", version.ref = "variousCards" }
```

in build.gradle app module: 

```gradle
 dependencies {
    implementation(libs.various.cards)
 }
```

if you haven't already, add jitpack to settings.gradle projects:

```gradle
 dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io") // add this line
          }
      }
  }
```

## Variant

Currently there's 3 card variants, and more are coming!

#### Outlined

![outlined-light](https://github.com/user-attachments/assets/7262d86d-9f25-4d53-afa2-b0c25320f9ce)
![outlined-dark](https://github.com/user-attachments/assets/1cd9bc4d-21c3-430c-b16f-526f6f5e377c)

Example usage:
 ```kotlin
OutlinedMenuCard(
    onClick = { /*TODO*/ },
    icon = {
        Icon(
            modifier = Modifier.size(48.dp),
            imageVector = Icons.Rounded.Person,
            contentDescription = "",
        )
    },
    title = "Title Card",
    textBody = textBody
)
```
#### Selectable

![unselected-light](https://github.com/user-attachments/assets/bdcc0124-50a4-413e-8907-af6afbaed2cb)
![selected-light](https://github.com/user-attachments/assets/6ae053a4-72a7-44a9-8045-ae0d362e9aec)
![unselected-dark](https://github.com/user-attachments/assets/3703fe68-bd5a-4399-8ef7-b4a5ba8b46ce)
![selected-dark](https://github.com/user-attachments/assets/970af1b6-be79-4b06-b797-0eb2c300dca3)

Example usage:
```kotlin
SelectableMenuCard(
    onClick = { /*TODO*/ },
    isSelected = isSelected,
    icon = {
        Icon(
            modifier = Modifier.size(48.dp),
            imageVector = Icons.Rounded.Person,
            contentDescription = "",
            tint = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurface
        )
    },
    title = "Title Card",
    textBody = textBody
)
```

#### Elevated

![elevated-light](https://github.com/user-attachments/assets/d69c4b20-4f9c-49ae-9ccf-ce6a74da3ca0)
![elevated-dark](https://github.com/user-attachments/assets/1aa07b27-c395-4c8d-b468-e940bb9da35d)

Example usage:
```kotlin
ElevatedMenuCard(
    onClick = { /*TODO*/ },
    icon = {
        Icon(
            modifier = Modifier.size(48.dp),
            imageVector = Icons.Rounded.Person,
            contentDescription = "",
        )
    },
    title = "Title Card",
    textBody = textBody
)
```

