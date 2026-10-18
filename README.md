# GAC1_com.yftech.service.main.apk

> Decompiled source repository for `com.yftech.service.main.apk`.

## Summary

- **APK file name**: `com.yftech.service.main.apk`
- **Package name**: `com.yftech.service.main`
- **Version**: `?` (versionCode `?`)
- **Min SDK**: `26`  |  **Target SDK**: `28`
- **Total decompiled classes**: `116`
- **Decompiled on**: 2026-10-18 12:14:54 UTC
- **Source repo**: [ammisaidkaidi/yftech-apks](https://github.com/ammisaidkaidi/yftech-apks)

## What this app does (inferred)

- Background service component
- Main coordinator service
- Bluetooth access
- Camera access
- External storage access

Inference is based on the APK file name, package name, declared permissions, registered services/receivers, and top-level Java package structure. Manual review of the source under `jadx_out/sources/` is recommended for definitive behavior.

## Permissions

- `android.Manifest.permission.MASTER_CLEAR`
- `android.permission.CAMERA`  (CAMERA)
- `android.permission.INTERACT_ACROSS_USERS`  (INTERACT_ACROSS_USERS)
- `android.permission.INTERACT_ACROSS_USERS_FULL`  (INTERACT_ACROSS_USERS_FULL)
- `android.permission.READ_EXTERNAL_STORAGE`  (READ_EXTERNAL_STORAGE)
- `android.permission.READ_PRIVILEGED_PHONE_STATE`  (READ_PRIVILEGED_PHONE_STATE)
- `android.permission.RECEIVE_BOOT_COMPLETED`  (RECEIVE_BOOT_COMPLETED)
- `android.permission.REORDER_TASKS`  (REORDER_TASKS)
- `android.permission.WRITE_EXTERNAL_STORAGE`  (WRITE_EXTERNAL_STORAGE)
- `com.yftech.permission.media.service`
- `com.yftech.permission.service.bluetooth`
- `com.yftech.permission.service.transfer.phonelink`
- `com.yftech.permission.service.vehicle.COMMON`

## App components (from AndroidManifest.xml)

**Application class**: `com.yftech.service.main.CarApplication`
**Launcher activity**: `(none found)`

### Activities (1)

- `com.yftech.service.main.testui.MainActivity`

### Services (1)

- `com.yftech.service.main.CarMainService`

### Broadcast receivers (0)

- (none)

### Content providers (0)

- (none)

## Java package structure

**Top-level packages**: `android`, `com`

**Detected third-party libraries**:

- Android framework (system)  (1 top-level entries)

**Custom (non-library) packages — depth 2**:

- `com.yftech`
- `com.yftech.service`
- `com.yftech.service.main`

## Key classes & method signatures

Per custom package, the top-level classes (up to 8 each) and their first few public method signatures.

### `com.yftech`  (0 class files in this folder)

(no top-level classes in this package)

### `com.yftech.service`  (0 class files in this folder)

(no top-level classes in this package)

### `com.yftech.service.main`  (6 class files in this folder)

- **class `CarApplication`**  (`CarApplication.java`, ~26 lines)
  - `void onCreate(...)`
  - `void run(...)`
  - `void onTerminate(...)`

- **class `CarMainService`**  (`CarMainService.java`, ~287 lines)
  - `void run(...)`
  - `void onPowerStateChanged(...)`
  - `void run(...)`
  - `void onAudioFocusChange(...)`
  - `void a(...)`
  - `IBinder onBind(...)`
  - `void onCreate(...)`
  - `void run(...)`
  - `void onDestroy(...)`
  - `int onStartCommand(...)`

- **class `is`**  (`R.java`, ~227 lines)

- **class `a`**  (`a.java`, ~12 lines)

- **class `b`**  (`b.java`, ~22 lines)

- **class `c`**  (`c.java`, ~370 lines)

## Decompilation methodology

This repo was produced by the following pipeline:

1. **APK download** — raw file fetched via the GitHub raw URL (no repo clone).
2. **apktool d** — decoded `AndroidManifest.xml`, resources (`res/`), `assets/`, native libs (`lib/`), and produced `apktool.yml` metadata.
3. **jadx -d** — produced Java-readable decompiled sources under `jadx_out/sources/`.
4. **Static analysis pass** — parsed manifest + walked `jadx_out/sources/` to enumerate packages, classes, methods, and detect known third-party libraries.
5. **README auto-generation** — produced this file with the static analysis results.

### Reproducing

```bash
# 1) download the APK (raw, no clone)
curl -L -o com.yftech.service.main.apk \
  'https://raw.githubusercontent.com/ammisaidkaidi/yftech-apks/main/com.yftech.service.main.apk'

# 2) decode resources + manifest
apktool d -f -o apktool_out com.yftech.service.main.apk

# 3) decompile to Java-readable sources
jadx -d jadx_out --no-res com.yftech.service.main.apk
```

> Note: `--no-res` is passed to jadx because apktool already decoded resources.

## Directory layout

``
GAC1_com.yftech.service.main.apk/
├── README.md                  <- this file
├── com.yftech.service.main.apk                 <- original APK binary
├── apktool_out/               <- apktool output (resources, manifest, smali)
└── jadx_out/                  <- jadx output (Java-readable sources)
```

### apktool_out/
```
├── AndroidManifest.xml
├── apktool.yml
├── assets/
│   ├── default.properties
│   ├── default_a58.properties
│   ├── default_car1105.properties
│   ├── default_ihu19.properties
│   ├── default_ihu23.properties
│   ├── source_policys.xml
│   ├── source_policys_a58.xml
│   ├── source_policys_a58_auth.xml
│   ├── source_policys_a79.xml
│   ├── source_policys_a88.xml
│   ├── source_policys_car011.xml
│   ├── source_policys_car015.xml
│   ├── source_policys_car1105.xml
│   ├── source_policys_ihu19.xml
│   ├── source_policys_ihu23.xml
│   ├── source_policys_ihu23_v2.xml
│   └── source_policys_pt025.xml
├── original/
│   ├── AndroidManifest.xml
│   └── META-INF/
├── res/
│   ├── drawable/
│   ├── layout/
│   ├── mipmap-hdpi/
│   ├── mipmap-mdpi/
│   ├── mipmap-xhdpi/
│   ├── mipmap-xxhdpi/
│   ├── mipmap-xxxhdpi/
│   └── values/
└── smali/
    ├── android/
    └── com/
```

### jadx_out/
```
├── resources/
└── sources/
    ├── android/
    └── com/
```

## Disclaimer

This repository contains decompiled (reverse-engineered) Java source code and resources derived from a binary APK. Decompilation was performed for research, interoperability, and educational purposes.

- The decompiled code is **not** the original source — variable names, comments, generics, and some control flow may have been lost or simplified during compilation/decompilation.
- All trademarks, copyrights, and IP belong to their respective owners (YF Tech / 御驾 (YF) Automotive).
- The author of this repo does not host the original APK on this repo's remote — only the decompiled artifacts. The original APK is publicly listed at the source repository cited above.
- This repository is for **analysis only**. Do not use it to redistribute or rebuild the original application.