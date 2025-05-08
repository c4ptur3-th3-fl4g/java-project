---
name: Test Statement Coverage
about: Viết test case để bao phủ toàn bộ các lệnh trong phương thức analyze()
title: "[TEST] Bao phủ tất cả lệnh (Statement Coverage)"
labels: testing, junit, coverage
assignees: ''

---

## Mục tiêu 🎯

Viết các test case bằng JUnit để đảm bảo tất cả các **lệnh** (statements) trong phương thức `analyze(int[] numbers)` trong lớp `App.java` được thực thi.

---

## Công việc cần làm ✅

- [ ] Viết test bao phủ cả vòng lặp `for` khi có phần tử và khi không có phần tử.
- [ ] Kiểm tra nhánh `if (num % 2 == 0)` và `else`.
- [ ] Kiểm tra các `return` ứng với các trường hợp: sum > 0, sum < 0, sum == 0.
- [ ] Chạy `mvn test` và xác minh bằng báo cáo JaCoCo tại `target/site/jacoco/index.html`.

---

## Kết quả mong đợi ✅

- Mọi dòng trong `App.analyze()` được đánh dấu "green" trong báo cáo JaCoCo.
- Tối thiểu 100% **line coverage**.

---
