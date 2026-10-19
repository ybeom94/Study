# Markdown 필수 문법 정리

## 1. 제목 (Heading)
```md
# 제목 1 (H1)
## 제목 2 (H2)
### 제목 3 (H3)
#### 제목 4 (H4)
##### 제목 5 (H5)
###### 제목 6 (H6)
```
---

## 2. 텍스트 강조 (Text Style)
```md
**굵은 글씨**

*기울임 글씨*

***굵고 기울임 글씨***

~~취소선~~

<ins>밑줄</ins>

`인라인 코드`
```
---

## 3. 줄바꿈 및 구분선
```md
첫 번째 문장입니다.  
두 번째 문장입니다. (끝에 공백 2개)

새로운 문단은 빈 줄로 구분합니다.
```
---

## 4. 목록 (List)
```md
### 순서 없는 목록
- 항목 1
- 항목 2
  - 하위 항목 2-1
  - 하위 항목 2-2
- 항목 3

### 순서 있는 목록
1. 첫 번째
2. 두 번째
3. 세 번째

### 체크리스트
- [x] 완료된 작업
- [ ] 진행 예정 작업
- [ ] 미완료 작업
```
---

## 5. 링크 (Link)
```md
[GitHub](https://github.com)

[Google](https://google.com)

<https://github.com>
```
---

## 6. 이미지 (Image)
```md
![이미지 설명](이미지_URL)

![로고](./images/logo.png)
```
---

## 7. 인용문 (Blockquote)
```md
> 인용문입니다.

> 중요한 안내 사항
>
> 여러 줄을 작성할 수 있습니다.
```
---

## 8. 코드 (Code)
```md
### 인라인 코드
`npm install`

### 코드 블록

```bash
npm install
npm run dev
```

```javascript
function hello() {
  console.log("Hello World!");
}
```

```html
<div>
  <h1>Hello World</h1>
</div>
```
```
---

## 9. 표 (Table)
```md
| 항목 | 설명 | 상태 |
|------|------|------|
| HTML | 웹 구조 | 완료 |
| CSS | 웹 스타일 | 진행 중 |
| JavaScript | 웹 기능 | 예정 |

### 표 정렬

| 왼쪽 정렬 | 가운데 정렬 | 오른쪽 정렬 |
|:----------|:-----------:|------------:|
| A | B | C |
| 100 | 200 | 300 |
```
---

## 10. 접기 / 펼치기 (Details)
```md
<details>
<summary>자세히 보기</summary>

여기에 숨길 내용을 작성합니다.

- 내용 1
- 내용 2
- 내용 3

</details>
```
---

## 11. 내부 목차 이동 (Anchor)
```md
[프로젝트 소개](#프로젝트-소개)

[설치 방법](#설치-방법)

[사용 방법](#사용-방법)

## 프로젝트 소개

프로젝트 설명을 작성합니다.

## 설치 방법

설치 방법을 작성합니다.

## 사용 방법

사용 방법을 작성합니다.
```
---

## 12. 배지 (Badge)
```md
![GitHub stars](https://img.shields.io/github/stars/OWNER/REPO)

![License](https://img.shields.io/badge/license-MIT-blue)

![Status](https://img.shields.io/badge/status-developing-green)
```
---

## 13. 키보드 단축키 표시
```md
<kbd>Ctrl</kbd> + <kbd>C</kbd>

<kbd>Ctrl</kbd> + <kbd>V</kbd>
```
---

## 14. 이모지 (Emoji)
```md
✅ 완료

🚀 배포

⚠️ 주의

📌 중요

🔧 설정

🐛 버그 수정
```
---

## 15. 주석 (Comment)
```md
<!-- README 화면에는 표시되지 않는 주석입니다. -->
```
---

## 16. 상대 경로 링크
```md
[라이선스](./LICENSE)

[문서 폴더](./docs/)

[설치 가이드](./docs/installation.md)
```