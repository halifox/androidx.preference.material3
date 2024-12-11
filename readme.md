# Preference-MD3

## 📖 简介
基于 androidx.preference 源码修改的首选项库，使其支持 Material Design 3 (MD3) 风格。

---

## ✨ 功能

- 支持 MD3 风格：修改默认样式，使首选项界面与 Material Design 3 风格完全兼容。

---

## 🎨 设计规范

- [Material Design 3 (MD3)](https://m3.material.io/)

---

## 📸 截图

![](./screenshot/Screenshot.webp)

---

## 🛠️ 使用方法

### 1. 配置依赖源
在项目的 `settings.gradle.kts` 中添加以下内容：
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //添加如下
        maven {
            url = uri("https://maven.pkg.github.com/halifox/androidx.preference.material3")
            credentials {
                username = "halifox"
                password = "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" // 测试密钥（只读，无期限）
            }
        }
    }
}
```

### 2. 添加依赖
在模块的 `build.gradle.kts` 中添加以下依赖：
```kotlin
dependencies {
    implementation("androidx.preference:preference-ktx-md3:1.2.1-alpha01")
}
```

### 3. 使用方法
所有 API 与 `androidx.preference` 完全相同，无需任何修改。详情请参考 [官方 API 文档](https://developer.android.com/jetpack/androidx/releases/preference)。

---

## 🤝 贡献

我们欢迎任何形式的社区贡献！  
请阅读 [贡献指南 (CONTRIBUTING.md)](CONTRIBUTING.md)，了解如何提交 Issue、请求功能或贡献代码。

---

## 📜 许可证

本项目遵循 [LGPL-3.0 License](LICENSE)。

---

## 🙏 致谢

- [Android SDK](https://developer.android.com/studio)
- [Material Components for Android](https://github.com/material-components/material-components-android)
- [androidx](https://github.com/androidx/androidx)

## 📢 法律声明

本开源项目仅供学习和交流用途。由于可能涉及专利或版权相关内容，请在使用前确保已充分理解相关法律法规。未经授权，**请勿将本工具用于商业用途或进行任何形式的传播**。

本项目的所有代码和相关内容仅供个人技术学习与参考，任何使用产生的法律责任由使用者自行承担。

感谢您的理解与支持。