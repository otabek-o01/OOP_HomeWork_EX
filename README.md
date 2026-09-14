# OOP_HomeWork_EX

## 1. Pitsa

`Pitsa` klassida pizza buyurtmasi bilan ishlash uchun field va methodlar yaratildi.

### Fieldlar

* `PIZZA` — pizza turi
* `size` — pizza o'lchami
* `Money` — to'lov miqdori

### Methodlar

* `SetMoney()` — to'lovni qabul qiladi
* `setPizza2()` — pizza turini tanlaydi
* `setSize()` — pizza o'lchamini belgilaydi
* `Tolov()` — buyurtma haqida ma'lumot chiqaradi

Dasturda `Scanner` orqali pizza turi, pul miqdori va pizza o'lchami kiritiladi.

---

## 2. OOP_Cards

`OOP_Cards` klassida bank hisobidagi ma'lumotlar bilan ishlash ko'rsatildi.

### Fieldlar

* `accountNumber` — hisob raqami
* `balance` — hisobdagi pul
* `transactionHistory` — operatsiyalar tarixi

### Methodlar

* `getTransactionHistory()` — operatsiyalar tarixini `String[]` ko'rinishida qaytaradi

Misol:

```java
String[] history = account.getTransactionHistory();
```

---

## 3. Telefon

`Telefon` klassida telefonning asosiy ma'lumotlari va methodlari yaratildi.

### Fieldlar

* `nomi` — telefon nomi
* `modeli` — telefon modeli
* `narxi` — telefon narxi
* `xotira` — telefon xotirasi
* `batareya` — batareya miqdori

### Methodlar

* `yoqish()` — telefonni yoqadi
* `ochirish()` — telefonni o'chiradi
* `malumot()` — telefon haqida ma'lumot chiqaradi

---

## 4. Restoran

`Restoran` klassida restoran bilan ishlash uchun kerakli field va methodlar yaratildi.

### Fieldlar

* `nomi` — restoran nomi
* `manzil` — restoran manzili
* `stolSoni` — stol soni
* `taom` — taom nomi
* `narx` — taom narxi

### Methodlar

* `buyurtmaBerish()` — taom buyurtma qiladi
* `stolBandQilish()` — stol band qiladi
* `malumot()` — restoran haqida ma'lumot chiqaradi

---

## 5. Kinoteatr

`Kinoteatr` klassida kinoteatr va film ma'lumotlari bilan ishlash mashq qilindi.

### Fieldlar

* `nomi` — kinoteatr nomi
* `filmNomi` — film nomi
* `davomiyligi` — film davomiyligi
* `chiptaNarxi` — chipta narxi
* `orinlarSoni` — o'rindiqlar soni
