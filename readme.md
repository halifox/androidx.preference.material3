# androidx.preference.material3

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

![](https://img.shields.io/github/v/tag/halifox/androidx.preference.material3)

```kotlin
dependencies {
    implementation("androidx.preference:preference-ktx-md3:1.2.1-alpha01")
}
```

### 3. 使用方法
所有 API 与 `androidx.preference` 完全相同，无需任何修改。详情请参考 [官方 API 文档](https://developer.android.com/jetpack/androidx/releases/preference)。

---

## 路线图

1. **添加更多的 Preference 类型**
    - 支持日期选择器、颜色选择器、文件选择器等新的控件类型。
    - 提供多选列表、多层级嵌套的树形菜单等复杂类型的 Preference。

2. **完善已有 Preference 的属性**
    - 增强控件的表现形式，如自定义字体、动态颜色适配等。
    - 增加动画效果支持，让交互更加流畅和直观。

3. **添加 CoordinatorLayout + AppBarLayout + Toolbar 的 Preference 头部布局**
    - 提供默认的可折叠布局，支持动态标题、滚动缩放效果。
    - 提供扩展接口，便于开发者自定义行为和样式。

4. **支持动态加载配置**
    - 实现动态加载 Preference 配置的功能，可以从服务器获取配置并实时更新界面。
    - 提供缓存机制，优化加载性能。

5. **优化性能和兼容性**
    - 减少内存占用，提高大规模 Preference 页面加载速度。
    - 兼容更多 Android 版本和厂商定制系统。

6. **增加测试工具支持**
    - 提供调试工具，便于开发者快速测试和验证 Preference 的行为。
    - 支持自动化测试的工具或方法，简化 QA 测试流程。

7. **增强用户体验**
    - 增加拖拽排序、滑动删除等交互功能。
    - 提供自定义布局支持，适配个性化的 UI 需求。

8. **国际化支持**
    - 提供多语言适配工具，自动检测并加载对应的语言资源。
    - 支持从外部文件动态切换语言。

9. **完善文档和示例**
    - 提供更详细的教程，包括视频演示和代码样例。
    - 开发在线 Playground，用户可以动态测试不同的配置效果。


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