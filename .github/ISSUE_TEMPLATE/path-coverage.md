---
name: Test Path/Branch Coverage
about: Viết test case để bao phủ toàn bộ các đường đi trong phương thức analyze()
title: "[TEST] Bao phủ tất cả đường đi (Branch/Path Coverage)"
labels: testing, junit, coverage
assignees: ''

---

## Mục tiêu 🎯

Viết các test case bằng JUnit để đảm bảo tất cả các **nhánh logic (đường đi)** trong phương thức `analyze(int[] numbers)` trong lớp `App.java` được kiểm thử.

---

## Công việc cần làm ✅

- [ ] Đảm bảo `if (num % 2 == 0)` được kiểm thử với cả giá trị đúng và sai.
- [ ] Tạo các test case dẫn đến kết quả `sum > 0`, `sum < 0`, và `sum == 0`.
- [ ] Bao phủ tình huống: mảng rỗng, tất cả số chẵn, tất cả số lẻ, hỗn hợp.
- [ ] Kiểm tra **branch coverage** bằng báo cáo JaCoCo tại `target/site/jacoco/index.html`.

---

## Kết quả mong đợi ✅

- 100% **branch coverage** trong báo cáo JaCoCo.
- Mọi nhánh điều kiện trong `App.analyze()` được kiểm thử đầy đủ.

---
