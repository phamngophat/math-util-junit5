[![Math Utility Project (CI included) | © 2026](https://github.com/phamngophat/math-util-junit5/actions/workflows/maven.yml/badge.svg)](https://github.com/phamngophat/math-util-junit5/actions/workflows/maven.yml)
# Math Utility Project (JUnit 5 & CI/CD)

Tài liệu tổng hợp kiến thức, cấu trúc mã nguồn, quy trình kiểm thử tự động và tích hợp liên tục (CI) cho dự án `mathutil-junit`.

---

## 1. Cấu trúc cây thư mục dự án

```text
mathutil-junit/
├── src/
│   ├── main/java/com/phatpn/mathutil/
│   │   ├── core/MathUtil.java           # Nghiệp vụ tính giai thừa getFactorial(n)
│   │   └── main/MathutilJunit.java      # Hàm main dùng để chạy thử nghiệm thủ công
│   └── test/
│       ├── java/com/phatpn/mathutil/core/
│       │   └── MathUtilTest.java        # Bộ kiểm thử tự động JUnit 5
│       └── resources/
│           └── factorial-data.csv       # File dữ liệu kiểm thử DDT
├── .gitignore                           # Loại bỏ file rác NetBeans và thư mục target/
├── pom.xml                              # Quản lý dependency (JUnit 5, JaCoCo, Surefire)
└── README.md                            # Báo cáo tổng hợp tiến trình dự án
