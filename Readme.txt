工廠模式 Factory Pattern
提供一個工廠介面，將產生實體的程式碼交由子類別各自實現，向客戶隱藏了哪種具體產品類將被實例化的細節
工廠是一個介面(TrainingCamp)，工廠介面只會規範實體工廠類別(ArcherTrainingCamp)應該返回哪種產品，實際上要如何製作產品則交給實體工廠來實作。


目的：
新手村現在建立了兩座訓練營，弓箭手訓練營、鬥士訓練營，如果想要修改弓箭手的訓練流程，就修改弓箭手訓練營裡面的程式碼即可，不用擔心是否會影響鬥士訓練營的運作。
但有會產生大量工廠子類別的缺點。

用途：
而角色增加時只需要加入新的具體工廠角色與具體產品角色，也就有效降低物件的耦合性。
可用在增加產品時，或增加類似物件時

實作：
Cipher cp = Cipher.getInstance("DESede");


抽象工廠模式 Abstract Factory Pattern
與工廠模式類似 
假如一個冒險者需要武器、頭盔、上衣、褲子、鞋子5種裝備， 村莊內又有4種不同專業的冒險者，這樣我們就要建立20種工廠類別來生產裝備，這樣Class就爆炸了。
可把工廠所需的物件種類增加，將多個不同的物件結合起來形成一個新的物件，來解決問題。

目的：
用一個工廠介面 將很多不相關的物件(裝備)組裝在一起 產生一個新的物件(角色)，但實際建立那些物件(裝備)由實作工廠的子類別來實現
像武器與衣服本來是扯不上關係的兩種物品，不過這兩種物品都是屬於同一種冒險者的裝備，因此他們就有了這層抽象關係。


實作：
ArcherEquipFactory弓箭手使用Bow和穿上Leather，產生一隻弓箭手。
可用在一種飲料珍珠奶茶 需加入多種材料牛奶 茶 珍珠 水 變成珍珠奶茶。
軟體中更換界面主題，要求界面中的按鈕、文本框、背景色等一起發生改變時。


本案例：
本案例將 Abstract Factory Pattern和 Factory Pattern結合
Factory Pattern使用角色的訓練產生弓箭手。
Abstract Factory Pattern使用角色的裝備，可多種混搭來選擇裝備。
最後結合成一支有武器的弓箭手。


