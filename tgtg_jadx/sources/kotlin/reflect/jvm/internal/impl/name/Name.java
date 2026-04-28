package kotlin.reflect.jvm.internal.impl.name;

import i4.a;
import j4.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class Name implements Comparable<Name> {

    @NotNull
    private final String name;
    private final boolean special;

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i11 == 1) {
            objArr[1] = "asString";
        } else if (i11 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private Name(@NotNull String str, boolean z11) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        this.name = str;
        this.special = z11;
    }

    @NotNull
    public static Name guessByFirstCharacter(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        return str.startsWith("<") ? special(str) : identifier(str);
    }

    @NotNull
    public static Name identifier(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        return new Name(str, false);
    }

    public static boolean isValidIdentifier(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static Name special(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        a.f("special name must start with '<': ".concat(str));
        return null;
    }

    @NotNull
    public String asString() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Name name) {
        return this.name.compareTo(name.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.special == name.special && this.name.equals(name.name);
    }

    @NotNull
    public String getIdentifier() {
        if (this.special) {
            d.e(this, "not identifier: ");
            return null;
        }
        String strAsString = asString();
        if (strAsString == null) {
            $$$reportNull$$$0(2);
        }
        return strAsString;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.special ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.special;
    }

    public String toString() {
        return this.name;
    }
}
