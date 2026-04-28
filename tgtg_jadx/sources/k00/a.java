package k00;

import com.adyen.checkout.components.core.Address;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.measurement.sa;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import w2.l1;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile sa f25619b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25618a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f25620c = new x0("id");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x0 f25621d = new x0("type");

    public static int a(int i11, int i12) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i12 == 0) {
            j4.d.f("/ by zero");
            return 0;
        }
        int i13 = i11 / i12;
        int i14 = i11 - (i12 * i13);
        if (i14 == 0) {
            return i13;
        }
        int i15 = ((i11 ^ i12) >> 31) | 1;
        switch (l0.f25667a[roundingMode.ordinal()]) {
            case 1:
                j4.d.f("mode was UNNECESSARY, but rounding was necessary");
                return 0;
            case 2:
                return i13;
            case 3:
                if (i15 >= 0) {
                    return i13;
                }
                break;
            case 4:
                break;
            case 5:
                if (i15 <= 0) {
                    return i13;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i14);
                int iAbs2 = iAbs - (Math.abs(i12) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i13;
                }
                if (iAbs2 <= 0) {
                    return i13;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i13 + i15;
    }

    public static int b(n nVar) {
        Iterator it = nVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strD;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i12 >= length) {
                break;
            }
            Object obj = objArr[i12];
            if (obj == null) {
                strD = Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                try {
                    strD = obj.toString();
                } catch (Exception e5) {
                    String strM = r8.k.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e5);
                    strD = org.bouncycastle.jcajce.provider.asymmetric.a.d("<", strM, " threw ", e5.getClass().getName(), ">");
                }
            }
            objArr[i12] = strD;
            i12++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i13 = 0;
        while (true) {
            length2 = objArr.length;
            if (i11 >= length2 || (iIndexOf = str.indexOf("%s", i13)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i13, iIndexOf);
            sb2.append(objArr[i11]);
            i11++;
            i13 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i13, str.length());
        if (i11 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb2.append(", ");
                sb2.append(objArr[i14]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(q0 q0Var) {
        StringBuilder sb2 = new StringBuilder(q0Var.e());
        for (int i11 = 0; i11 < q0Var.e(); i11++) {
            byte b8 = q0Var.b(i11);
            if (b8 == 34) {
                sb2.append("\\\"");
            } else if (b8 == 39) {
                sb2.append("\\'");
            } else if (b8 != 92) {
                switch (b8) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append(CodeBlockHandler.NEWLINE_REGEX);
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b8 < 32 || b8 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b8 >>> 6) & 3) + 48));
                            sb2.append((char) (((b8 >>> 3) & 7) + 48));
                            sb2.append((char) ((b8 & 7) + 48));
                        } else {
                            sb2.append((char) b8);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void e(int i11, int i12) {
        String strC;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strC = c("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    i4.a.f(j4.s.f(i12, "negative size: "));
                    return;
                }
                strC = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            c50.w.l("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            c50.w.l(w.a0.p("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb2, Iterator it, qb.e eVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(qb.e.J(entry.getKey()));
            sb2.append(" : ");
            sb2.append(qb.e.J(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(qb.e.J(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(qb.e.J(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = u.f25693b;
            }
        } else {
            if (!(collection instanceof r)) {
                return false;
            }
            objComparator = ((r) collection).f25685d;
        }
        return comparator.equals(objComparator);
    }

    public static byte[] j(byte[]... bArr) {
        int i11 = 0;
        int length = 0;
        while (true) {
            if (i11 >= bArr.length) {
                break;
            }
            length += bArr[i11].length;
            i11++;
        }
        byte[] bArr2 = new byte[length];
        int i12 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length2);
            i12 += length2;
        }
        return bArr2;
    }

    public static final y0 k(a1 a1Var) throws zzhj {
        try {
            z0 z0VarP = a1Var.p();
            if (z0VarP == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b8 = z0VarP.f25715b;
                byte b11 = z0VarP.f25714a;
                int i11 = 0;
                if (b11 == -128) {
                    long jA = a1Var.a();
                    if (jA > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    l(b8, jA);
                    y0[] y0VarArr = new y0[(int) jA];
                    while (i11 < jA) {
                        y0VarArr[i11] = k(a1Var);
                        i11++;
                    }
                    return new s0(l.l(y0VarArr));
                }
                try {
                    if (b11 != -96) {
                        if (b11 == -64) {
                            throw new zzhj("Tags are currently unsupported");
                        }
                        if (b11 == -32) {
                            return new t0(a1Var.r());
                        }
                        if (b11 == 0 || b11 == 32) {
                            long jE = a1Var.e();
                            l(b8, jE > 0 ? jE : ~jE);
                            return new v0(jE);
                        }
                        if (b11 == 64) {
                            a1Var.A((byte) 64);
                            byte[] bArrG = a1Var.G();
                            int length = bArrG.length;
                            l(b8, length);
                            return new u0(q0.j(length, bArrG));
                        }
                        if (b11 != 96) {
                            throw new zzhj("Unidentifiable major type: " + ((b11 >> 5) & 7));
                        }
                        a1Var.A((byte) 96);
                        String str = new String(a1Var.G(), StandardCharsets.UTF_8);
                        l(b8, str.length());
                        return new x0(str);
                    }
                    long jG = a1Var.g();
                    if (jG > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR map");
                    }
                    l(b8, jG);
                    int i12 = (int) jG;
                    dn.k[] kVarArr = new dn.k[i12];
                    y0 y0Var = null;
                    int i13 = 0;
                    while (i13 < jG) {
                        y0 y0VarK = k(a1Var);
                        if (y0Var != null && y0VarK.compareTo(y0Var) <= 0) {
                            throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + y0Var.toString() + "\nCurrent key: " + y0VarK.toString());
                        }
                        kVarArr[i13] = new dn.k(29, y0VarK, k(a1Var));
                        i13++;
                        y0Var = y0VarK;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i11 < i12) {
                        dn.k kVar = kVarArr[i11];
                        if (treeMap.containsKey((y0) kVar.f15018b)) {
                            throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((y0) kVar.f15018b, (y0) kVar.f15019c);
                        i11++;
                    }
                    return new w0(q.b(treeMap));
                } catch (RuntimeException e5) {
                    e = e5;
                    throw new zzhj(e);
                }
            } catch (IOException | RuntimeException e11) {
                e = e11;
            }
        } catch (IOException e12) {
            throw new zzhj(e12);
        }
    }

    public static final void l(byte b8, long j9) throws zzhf {
        switch (b8) {
            case 24:
                if (j9 < 24) {
                    throw new zzhf(l1.e("Integer value ", j9, " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j9 < 256) {
                    throw new zzhf(l1.e("Integer value ", j9, " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j9 < 65536) {
                    throw new zzhf(l1.e("Integer value ", j9, " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j9 < 4294967296L) {
                    throw new zzhf(l1.e("Integer value ", j9, " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? n(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? n(i12, i13, "end index") : c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static String n(int i11, int i12, String str) {
        if (i11 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        i4.a.f(j4.s.f(i12, "negative size: "));
        return null;
    }
}
