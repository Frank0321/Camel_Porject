# Camel_Porject
練習 spring camel 專案

## 排程執行
1. 在 application 新增 `@ImportResource` 讀取 xml 設定
   - 指向 routes/routes.xml 設定檔
2. routes.xml 設定
   - bean 為 sampleBean 參數來源與對應為 say -> greeting
   - 使用 timer 設定多久執行一次，並且執行 bean 裏面的哪一種方法
  