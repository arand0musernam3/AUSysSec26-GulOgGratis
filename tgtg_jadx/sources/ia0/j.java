package ia0;

import com.braze.Constants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Charsets;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f23646d = new j(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f23648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f23649c;

    public j(byte[] bArr) {
        bArr.getClass();
        this.f23647a = bArr;
    }

    public static int h(j jVar, j jVar2) {
        jVar.getClass();
        jVar2.getClass();
        return jVar.g(0, jVar2.i());
    }

    public static int l(j jVar, j jVar2) {
        jVar.getClass();
        jVar2.getClass();
        return jVar.k(jVar2.i());
    }

    public static /* synthetic */ j q(j jVar, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = -1234567890;
        }
        return jVar.p(i11, i12);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i11 = objectInputStream.readInt();
        if (i11 < 0) {
            i4.a.i(j4.s.f(i11, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = objectInputStream.read(bArr, i12, i11 - i12);
            if (i13 == -1) {
                i4.a.b();
                return;
            }
            i12 += i13;
        }
        j jVar = new j(bArr);
        Field declaredField = j.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY);
        declaredField.setAccessible(true);
        declaredField.set(this, jVar.f23647a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f23647a.length);
        objectOutputStream.write(this.f23647a);
    }

    public String a() {
        byte[] bArr = this.f23647a;
        byte[] bArr2 = a.f23601a;
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte b8 = bArr[i11];
            int i13 = i11 + 2;
            byte b11 = bArr[i11 + 1];
            i11 += 3;
            byte b12 = bArr[i13];
            bArr3[i12] = bArr2[(b8 & 255) >> 2];
            bArr3[i12 + 1] = bArr2[((b8 & 3) << 4) | ((b11 & 255) >> 4)];
            int i14 = i12 + 3;
            bArr3[i12 + 2] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i12 += 4;
            bArr3[i14] = bArr2[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i11];
            bArr3[i12] = bArr2[(b13 & 255) >> 2];
            bArr3[i12 + 1] = bArr2[(b13 & 3) << 4];
            bArr3[i12 + 2] = 61;
            bArr3[i12 + 3] = 61;
        } else if (length2 == 2) {
            int i15 = i11 + 1;
            byte b14 = bArr[i11];
            byte b15 = bArr[i15];
            bArr3[i12] = bArr2[(b14 & 255) >> 2];
            bArr3[i12 + 1] = bArr2[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i12 + 2] = bArr2[(b15 & 15) << 2];
            bArr3[i12 + 3] = 61;
        }
        return new String(bArr3, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        jVar.getClass();
        int iE = e();
        int iE2 = jVar.e();
        int iMin = Math.min(iE, iE2);
        for (int i11 = 0; i11 < iMin; i11++) {
            int iJ = j(i11) & 255;
            int iJ2 = jVar.j(i11) & 255;
            if (iJ != iJ2) {
                return iJ < iJ2 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE < iE2 ? -1 : 1;
    }

    public j d(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f23647a, 0, e());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new j(bArrDigest);
    }

    public int e() {
        return this.f23647a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iE = jVar.e();
            byte[] bArr = this.f23647a;
            if (iE == bArr.length && jVar.n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f23647a;
        char[] cArr = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b8 : bArr) {
            int i12 = i11 + 1;
            char[] cArr2 = ja0.b.f24794a;
            cArr[i11] = cArr2[(b8 >> 4) & 15];
            i11 += 2;
            cArr[i12] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public int g(int i11, byte[] bArr) {
        bArr.getClass();
        int length = this.f23647a.length - bArr.length;
        int iMax = Math.max(i11, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(iMax, this.f23647a, 0, bArr, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i11 = this.f23648b;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = Arrays.hashCode(this.f23647a);
        this.f23648b = iHashCode;
        return iHashCode;
    }

    public byte[] i() {
        return this.f23647a;
    }

    public byte j(int i11) {
        return this.f23647a[i11];
    }

    public int k(byte[] bArr) {
        bArr.getClass();
        for (int iMin = Math.min(e(), this.f23647a.length - bArr.length); -1 < iMin; iMin--) {
            if (b.a(iMin, this.f23647a, 0, bArr, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean m(int i11, j jVar, int i12) {
        jVar.getClass();
        return jVar.n(0, this.f23647a, i11, i12);
    }

    public boolean n(int i11, byte[] bArr, int i12, int i13) {
        bArr.getClass();
        if (i11 < 0) {
            return false;
        }
        byte[] bArr2 = this.f23647a;
        return i11 <= bArr2.length - i13 && i12 >= 0 && i12 <= bArr.length - i13 && b.a(i11, bArr2, i12, bArr, i13);
    }

    public String o(Charset charset) {
        charset.getClass();
        return new String(this.f23647a, charset);
    }

    public j p(int i11, int i12) {
        if (i12 == -1234567890) {
            i12 = e();
        }
        if (i11 < 0) {
            i4.a.f("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f23647a;
        if (i12 > bArr.length) {
            i4.a.i(r8.k.o(new StringBuilder("endIndex > length("), this.f23647a.length, ')'));
            return null;
        }
        if (i12 - i11 >= 0) {
            return (i11 == 0 && i12 == bArr.length) ? this : new j(kotlin.collections.x.k(bArr, i11, i12));
        }
        i4.a.f("endIndex < beginIndex");
        return null;
    }

    public j r() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f23647a;
            if (i11 >= bArr.length) {
                return this;
            }
            byte b8 = bArr[i11];
            if (b8 >= 65 && b8 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i11] = (byte) (b8 + 32);
                for (int i12 = i11 + 1; i12 < bArrCopyOf.length; i12++) {
                    byte b11 = bArrCopyOf[i12];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i12] = (byte) (b11 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i11++;
        }
    }

    public final String s() {
        String str = this.f23649c;
        if (str != null) {
            return str;
        }
        byte[] bArrI = i();
        bArrI.getClass();
        String str2 = new String(bArrI, Charsets.UTF_8);
        this.f23649c = str2;
        return str2;
    }

    public void t(g gVar, int i11) {
        gVar.write(this.f23647a, 0, i11);
    }

    public String toString() {
        byte b8;
        int i11;
        byte[] bArr = this.f23647a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            if (i12 >= length) {
                break;
            }
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                int i15 = i14 + 1;
                if (i14 == 64) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                }
                i13 += b11 < 65536 ? 1 : 2;
                i12++;
                while (true) {
                    i14 = i15;
                    if (i12 < length && (b8 = bArr[i12]) >= 0) {
                        i12++;
                        i15 = i14 + 1;
                        if (i14 == 64) {
                            break loop0;
                        }
                        if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (127 <= b8 && b8 < 160))) || b8 == 65533) {
                            break loop0;
                        }
                        i13 += b8 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i16 = i12 + 1;
                if (length > i16) {
                    byte b12 = bArr[i16];
                    if ((b12 & 192) == 128) {
                        int i17 = (b12 ^ ByteCompanionObject.MIN_VALUE) ^ (b11 << 6);
                        if (i17 >= 128) {
                            i11 = i14 + 1;
                            if (i14 == 64) {
                                break;
                            }
                            if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                break;
                            }
                            i13 += i17 < 65536 ? 1 : 2;
                            i12 += 2;
                            i14 = i11;
                        } else if (i14 != 64) {
                            break;
                        }
                    } else if (i14 != 64) {
                        break;
                    }
                } else if (i14 != 64) {
                    break;
                }
            } else if ((b11 >> 4) == -2) {
                int i18 = i12 + 2;
                if (length > i18) {
                    byte b13 = bArr[i12 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i18];
                        if ((b14 & 192) == 128) {
                            int i19 = ((b14 ^ ByteCompanionObject.MIN_VALUE) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i19 < 2048) {
                                if (i14 != 64) {
                                    break;
                                }
                            } else if (55296 > i19 || i19 >= 57344) {
                                i11 = i14 + 1;
                                if (i14 == 64) {
                                    break;
                                }
                                if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                    break;
                                }
                                i13 += i19 < 65536 ? 1 : 2;
                                i12 += 3;
                                i14 = i11;
                            } else if (i14 != 64) {
                                break;
                            }
                        } else if (i14 != 64) {
                            break;
                        }
                    } else if (i14 != 64) {
                        break;
                    }
                } else if (i14 != 64) {
                    break;
                }
            } else if ((b11 >> 3) == -2) {
                int i21 = i12 + 3;
                if (length > i21) {
                    byte b15 = bArr[i12 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i12 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i21];
                            if ((b17 & 192) == 128) {
                                int i22 = (((b17 ^ ByteCompanionObject.MIN_VALUE) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                                if (i22 > 1114111) {
                                    if (i14 != 64) {
                                        break;
                                    }
                                } else if (55296 > i22 || i22 >= 57344) {
                                    if (i22 >= 65536) {
                                        i11 = i14 + 1;
                                        if (i14 == 64) {
                                            break;
                                        }
                                        if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                                            break;
                                        }
                                        i13 += i22 < 65536 ? 1 : 2;
                                        i12 += 4;
                                        i14 = i11;
                                    } else if (i14 != 64) {
                                        break;
                                    }
                                } else if (i14 != 64) {
                                    break;
                                }
                            } else if (i14 != 64) {
                                break;
                            }
                        } else if (i14 != 64) {
                            break;
                        }
                    } else if (i14 != 64) {
                        break;
                    }
                } else if (i14 != 64) {
                    break;
                }
            } else if (i14 != 64) {
                break;
            }
        }
        i13 = -1;
        if (i13 != -1) {
            String strS = s();
            String strN = kotlin.text.y.n(kotlin.text.y.n(kotlin.text.y.n(strS.substring(0, i13), "\\", "\\\\", false), "\n", CodeBlockHandler.NEWLINE_REGEX, false), "\r", "\\r", false);
            if (i13 >= strS.length()) {
                return e0.f.g(']', "[text=", strN);
            }
            return "[size=" + this.f23647a.length + " text=" + strN + "…]";
        }
        if (this.f23647a.length <= 64) {
            return "[hex=" + f() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.f23647a.length);
        sb2.append(" hex=");
        byte[] bArr2 = this.f23647a;
        if (64 > bArr2.length) {
            i4.a.i(r8.k.o(new StringBuilder("endIndex > length("), this.f23647a.length, ')'));
            return null;
        }
        sb2.append((64 == bArr2.length ? this : new j(kotlin.collections.x.k(bArr2, 0, 64))).f());
        sb2.append("…]");
        return sb2.toString();
    }
}
