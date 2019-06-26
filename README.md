# SystemObslugiMagazynu

# Projekt został zrealizowany w ramach przedmiotu "Projekt programistyczny indywidualny" na Uniwersytecie Kardynała Stefana Wyszyńskiego w Warszawie. 

# Przedmiotem projektu jest system zarządzania i kontrolowania zawartości magazynów, wykonany przy użyciu technologii bazodanowych MySQL oraz Javy JDK 1.8. System ma za zadanie ułatwiać obsługę związaną z przyjmowaniem i wydawaniem produktów, lokalizowaniem ich oraz aktualizacją inwentarzu. System umożliwia również wgląd na statystyki zarządzanych obiektów.

# Funkcjonalności systemu:

- Podgląd wszystkich produktów i ich atrybutów dodanych do systemu
- Dodawanie produktów do inwentarza z podziałem na: nazwę, typ, jednostkę miary, ilość, magazyn (położenie), sektor (położenie), datę dostawy, planowaną datę wydania, dostawce i cenę.
- Edytowanie ww. atrybutów wprowadzonych produktów
- Usuwanie produktów (przeniesienie do archiwum)
- Podgląd wszystkich magazynów i ich atrybutów dodanych do systemu
- Dodawanie magazynów z podziałem na: nazwę, adres i ilość sektorów
- Edytowanie ww. atrybutów magazynów
- Blokowanie magazynów (podczas wprowadzania nowego produktu – brak możliwości wybrania konkretnego magazynu)
- Odblokowanie magazynów
- Usunięcie magazynów (przeniesienie wszystkich produktów do archiwum i podczas wprowadzania nowego produktu – brak możliwości wybrania konkretnego magazynu)
- Podgląd wszystkich dostawców i ich atrybutów dodanych do systemu
- Dodawanie dostawców z podziałem na: nazwę, adres i numer NIP
- Edytowanie ww. atrybutów dostawców
- Blokowanie dostawców (podczas wprowadzania nowego produktu – brak możliwości wybrania konkretnego dostawcy)
- Podgląd historii usuniętych produktów
- Przywrócenie produktów z archiwum do głównego inwentarza
- Generowanie dokumentów PZ, PW, WW
- Podgląd dokumentów
- Usuwanie dokumentów
- Podgląd statystyk inwentarza na podstawie zgromadzonych danych (produkty na stanie, produkty w archiwum, ilość typów produktów, ilość magazynów, ilość sektorów, ilość dostawców, ilość odbiorców, ilość faktur, ilość użytkowników systemu, wykres roczny przybywania nowych produktów, wykres zapełnienia poszczególnych magazynów, topowy magazyn, topowy produkt, topowy dostawca)
- Podgląd informacji o koncie (nazwa użytkownika, imię, nazwisko, typ konta, data rejestracji, długość sesji, status konta)
- Zmiana loginu i hasła
- Zgłaszanie błędów systemu do administratora
- Notatki ogólne (widoczne dla każdego użytkownika) i prywatne (widoczne tylko dla konkretnego użytkownika)
- Podgląd zgłoszonych przez użytkownik błędów
- Zmiana statusu błędu (nierozpatrzony, rozpatrzony, neutralny, priorytetowy)
- Podgląd statystyk zgłoszonych błędów z podziałem na status
- Dodawanie nowych użytkowników z podziałem na: imię, nazwisko, login, hasło, typ konta
- Edytowanie ww. atrybutów użytkowników
- Zmiana konfiguracji systemu z podziałem na: nazwę systemu, nazwę skróconą systemu, nazwę firmy, wersję systemu, adres strony internetowej, ogłoszenie administratora, wiadomość powitalną
- Zamknięcie systemu – brak możliwości logowania dla zwykłych użytkowników
- Otworzenie systemu

# Graficzny interfejs użytkownika

System korzysta z graficznej biblioteki używanej w języku Java - Swing. Jest nowszą, ulepszoną wersją biblioteki AWT, pozwalającej między innymi na lepsze gospodarowanie zasobami.
W pliku GUI.pdf znajduje się prezentacja graficznego interfejsu systemu.

Projekt i wykonanie: Marcin Kos
