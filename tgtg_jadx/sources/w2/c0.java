package w2;

import a3.l3;
import android.graphics.PointF;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import c5.u3;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m2.a2;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final long a(long j9, CharSequence charSequence) {
        int i11 = m5.t0.f29649c;
        int iCharCount = (int) (j9 >> 32);
        int iCharCount2 = (int) (4294967295L & j9);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (u(iCodePointBefore) && (t(iCodePointAt) || s(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (u(iCodePointBefore));
            return m5.k0.b(iCharCount, iCharCount2);
        }
        if (!u(iCodePointAt)) {
            return j9;
        }
        if (!t(iCodePointBefore) && !s(iCodePointBefore)) {
            return j9;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (u(iCodePointAt));
        return m5.k0.b(iCharCount, iCharCount2);
    }

    public static final long b(m5.q0 q0Var, long j9, long j11, z4.z zVar, u3 u3Var) {
        if (q0Var != null) {
            m5.r rVar = q0Var.f29618b;
            if (zVar != null) {
                long jP = zVar.P(j9);
                long jP2 = zVar.P(j11);
                int iL = l(rVar, jP, u3Var);
                int iL2 = l(rVar, jP2, u3Var);
                if (iL != -1) {
                    if (iL2 != -1) {
                        iL = Math.min(iL, iL2);
                    }
                    iL2 = iL;
                } else if (iL2 == -1) {
                    return m5.t0.f29648b;
                }
                float fB = (rVar.b(iL2) + rVar.f(iL2)) / 2;
                int i11 = (int) (jP >> 32);
                int i12 = (int) (jP2 >> 32);
                return rVar.h(new h4.c(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), fB - 0.1f, Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), fB + 0.1f), 0, m5.o0.f29601a);
            }
        }
        return m5.t0.f29648b;
    }

    public static final long c(m2.e1 e1Var, h4.c cVar, h4.c cVar2, int i11) {
        long jN = n(e1Var, cVar, i11);
        if (m5.t0.d(jN)) {
            return m5.t0.f29648b;
        }
        long jN2 = n(e1Var, cVar2, i11);
        if (m5.t0.d(jN2)) {
            return m5.t0.f29648b;
        }
        int i12 = (int) (jN >> 32);
        int i13 = (int) (jN2 & 4294967295L);
        return m5.k0.b(Math.min(i12, i12), Math.max(i13, i13));
    }

    public static final long d(o1 o1Var, h4.c cVar, h4.c cVar2, int i11) {
        long jO = o(o1Var, cVar, i11);
        if (m5.t0.d(jO)) {
            return m5.t0.f29648b;
        }
        long jO2 = o(o1Var, cVar2, i11);
        if (m5.t0.d(jO2)) {
            return m5.t0.f29648b;
        }
        int i12 = (int) (jO >> 32);
        int i13 = (int) (jO2 & 4294967295L);
        return m5.k0.b(Math.min(i12, i12), Math.max(i13, i13));
    }

    public static final boolean e(m5.q0 q0Var, int i11) {
        m5.r rVar = q0Var.f29618b;
        int iD = rVar.d(i11);
        return i11 == q0Var.i(iD) || i11 == rVar.c(iD, false) ? q0Var.j(i11) != q0Var.a(i11) : q0Var.a(i11) != q0Var.a(i11 - 1);
    }

    public static final long f(int i11, CharSequence charSequence) {
        int iCharCount = i11;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!t(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i11 < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i11);
            if (!t(iCodePointAt)) {
                break;
            }
            i11 += Character.charCount(iCodePointAt);
        }
        return m5.k0.b(iCharCount, i11);
    }

    public static final ExtractedText g(r5.y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f37714a.f29538b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j9 = yVar.f37715b;
        extractedText.selectionStart = m5.t0.g(j9);
        extractedText.selectionEnd = m5.t0.f(j9);
        extractedText.flags = !StringsKt.A(yVar.f37714a.f29538b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long h(PointF pointF) {
        float f11 = pointF.x;
        float f12 = pointF.y;
        return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
    }

    public static final long i(long j9, h4.c cVar) {
        int i11 = (int) (j9 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        float fIntBitsToFloat2 = cVar.f21380a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
            fIntBitsToFloat2 = cVar.f21382c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i11);
            }
        }
        int i12 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i12);
        float fIntBitsToFloat5 = cVar.f21381b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i12);
            fIntBitsToFloat5 = cVar.f21383d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i12);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static final boolean j(h4.c cVar, float f11, float f12) {
        float f13 = cVar.f21380a;
        if (f11 > cVar.f21382c || f13 > f11) {
            return false;
        }
        return f12 <= cVar.f21383d && cVar.f21381b <= f12;
    }

    public static final long k(o1 o1Var, long j9) {
        h4.b bVar;
        z4.z zVarD = o1Var.d();
        if (zVarD != null) {
            z4.z zVarB = o1Var.b();
            if (zVarB != null) {
                bVar = new h4.b((zVarD.n() && zVarB.n()) ? zVarD.g(zVarB, j9) : j9);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                return bVar.f21378a;
            }
        }
        return j9;
    }

    public static final int l(m5.r rVar, long j9, u3 u3Var) {
        float fG = u3Var != null ? u3Var.g() : 0.0f;
        int i11 = (int) (4294967295L & j9);
        int iE = rVar.e(Float.intBitsToFloat(i11));
        if (Float.intBitsToFloat(i11) < rVar.f(iE) - fG || Float.intBitsToFloat(i11) > rVar.b(iE) + fG) {
            return -1;
        }
        int i12 = (int) (j9 >> 32);
        if (Float.intBitsToFloat(i12) < (-fG) || Float.intBitsToFloat(i12) > rVar.f29626d + fG) {
            return -1;
        }
        return iE;
    }

    public static final int m(m5.r rVar, long j9, z4.z zVar, u3 u3Var) {
        long jP;
        int iL;
        if (zVar == null || (iL = l(rVar, (jP = zVar.P(j9)), u3Var)) == -1) {
            return -1;
        }
        return rVar.g(h4.b.a((rVar.b(iL) + rVar.f(iL)) / 2.0f, 1, jP));
    }

    public static final long n(m2.e1 e1Var, h4.c cVar, int i11) {
        a2 a2VarD = e1Var.d();
        m5.r rVar = a2VarD != null ? a2VarD.f28762a.f29618b : null;
        z4.z zVarC = e1Var.c();
        return (rVar == null || zVarC == null) ? m5.t0.f29648b : rVar.h(cVar.k(zVarC.P(0L)), i11, m5.o0.f29602b);
    }

    public static final long o(o1 o1Var, h4.c cVar, int i11) {
        m5.q0 q0VarG = o1Var.f43008b.g();
        m5.r rVar = q0VarG != null ? q0VarG.f29618b : null;
        z4.z zVarD = o1Var.d();
        return (rVar == null || zVarD == null) ? m5.t0.f29648b : rVar.h(cVar.k(zVarD.P(0L)), i11, m5.o0.f29602b);
    }

    public static final void p(v2.a aVar, int i11, int i12) {
        m5.t0 t0Var = aVar.f41923e;
        int iMin = Math.min(i11, i12);
        int iMax = Math.max(i11, i12);
        aVar.c(iMin, iMax, "");
        if (t0Var != null) {
            long jB = v2.k.b(iMin, iMax, 0, t0Var.f29650a);
            if (m5.t0.d(jB)) {
                aVar.e(null);
            } else {
                aVar.d(null, m5.t0.g(jB), m5.t0.f(jB));
            }
        }
    }

    public static final void q(v2.a aVar, int i11, int i12, CharSequence charSequence) {
        int iMin = Math.min(i11, i12);
        int iMax = Math.max(i11, i12);
        int i13 = 0;
        int i14 = iMin;
        while (i14 < iMax && i13 < charSequence.length() && charSequence.charAt(i13) == aVar.f41920b.charAt(i14)) {
            i13++;
            i14++;
        }
        int length = charSequence.length();
        while (iMax > i14 && length > i13 && charSequence.charAt(length - 1) == aVar.f41920b.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i14 == iMax && i13 == length) {
            aVar.e(null);
            aVar.f41925g = null;
        } else {
            aVar.c(i14, iMax, charSequence.subSequence(i13, length));
        }
        int length2 = charSequence.length() + iMin;
        aVar.f(m5.k0.b(length2, length2));
    }

    public static final boolean r(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean s(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean t(int i11) {
        return Character.isWhitespace(i11) || i11 == 160;
    }

    public static final boolean u(int i11) {
        int type;
        return (!t(i11) || (type = Character.getType(i11)) == 14 || type == 13 || i11 == 10) ? false : true;
    }

    public static final b4.t v(b4.t tVar, b bVar, m2.e1 e1Var, l3 l3Var) {
        return tVar.then(new a0(bVar, e1Var, l3Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a w(c5.x0 r13, w2.s1 r14, w2.o1 r15, r5.m r16, al.e r17, w2.y0 r18, y80.e1 r19, c5.u3 r20, w2.z0 r21, z70.c r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof w2.c
            if (r1 == 0) goto L16
            r1 = r0
            w2.c r1 = (w2.c) r1
            int r2 = r1.f42846k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f42846k = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            w2.c r1 = new w2.c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.f42845j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r12.f42846k
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
        L2c:
            r13 = 0
            return r13
        L2e:
            ba0.g.M(r0)
            goto L64
        L32:
            ba0.g.M(r0)
            android.view.View r0 = r13.f7405a
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r2 < r4) goto L45
            w2.k r2 = new w2.k
            r4 = 7
            r2.<init>(r0, r4)
        L43:
            r8 = r2
            goto L4c
        L45:
            ub.a r2 = new ub.a
            r4 = 7
            r2.<init>(r0, r4)
            goto L43
        L4c:
            r12.f42846k = r3
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            y70.a r13 = x(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r1) goto L64
            return r1
        L64:
            qc.y.m()
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.c0.w(c5.x0, w2.s1, w2.o1, r5.m, al.e, w2.y0, y80.e1, c5.u3, w2.z0, z70.c):y70.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a x(c5.x0 r17, w2.s1 r18, w2.o1 r19, r5.m r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function0 r22, ub.a r23, y80.e1 r24, c5.u3 r25, kotlin.jvm.functions.Function1 r26, z70.c r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof w2.d
            if (r1 == 0) goto L15
            r1 = r0
            w2.d r1 = (w2.d) r1
            int r2 = r1.f42848k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f42848k = r2
            goto L1a
        L15:
            w2.d r1 = new w2.d
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f42847j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f42848k
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 == r4) goto L2c
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
        L2a:
            r0 = 0
            return r0
        L2c:
            ba0.g.M(r0)
            goto L57
        L30:
            ba0.g.M(r0)
            w2.g r5 = new w2.g
            r16 = 0
            r10 = r17
            r7 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r9 = r23
            r6 = r24
            r14 = r25
            r15 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.f42848k = r4
            java.lang.Object r0 = v80.f0.n(r5, r1)
            if (r0 != r2) goto L57
            return r2
        L57:
            qc.y.m()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.c0.x(c5.x0, w2.s1, w2.o1, r5.m, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, ub.a, y80.e1, c5.u3, kotlin.jvm.functions.Function1, z70.c):y70.a");
    }

    public static final void y(CharSequence charSequence, char[] cArr, int i11, int i12, int i13) {
        if (charSequence instanceof v2.b) {
            y(((v2.b) charSequence).f41928c, cArr, i11, i12, i13);
            return;
        }
        while (i12 < i13) {
            cArr[i11] = charSequence.charAt(i12);
            i12++;
            i11++;
        }
    }

    public static final void z(EditorInfo editorInfo, CharSequence charSequence, long j9, r5.m mVar) {
        int i11;
        int i12;
        int i13 = mVar.f37693e;
        int i14 = mVar.f37692d;
        boolean z11 = mVar.f37689a;
        if (i13 == 1) {
            i11 = z11 ? 6 : 0;
        } else if (i13 == 0) {
            i11 = 1;
        } else if (i13 == 2) {
            i11 = 2;
        } else if (i13 == 6) {
            i11 = 5;
        } else if (i13 == 5) {
            i11 = 7;
        } else if (i13 == 3) {
            i11 = 3;
        } else if (i13 == 4) {
            i11 = 4;
        } else {
            if (i13 != 7) {
                h2.b("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i11;
        t5.c cVar = mVar.f37694f;
        if (Intrinsics.areEqual(cVar, t5.c.f39795c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(cVar, 10));
            Iterator it = cVar.f39796a.iterator();
            while (it.hasNext()) {
                arrayList.add(((t5.b) it.next()).f39794a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i14 == 1) {
            i12 = 1;
        } else if (i14 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i12 = 1;
        } else if (i14 == 3) {
            i12 = 2;
        } else if (i14 == 4) {
            i12 = 3;
        } else if (i14 == 5) {
            i12 = 17;
        } else if (i14 == 6) {
            i12 = 33;
        } else if (i14 == 7) {
            i12 = 129;
        } else if (i14 == 8) {
            i12 = 18;
        } else {
            if (i14 != 9) {
                h2.b("Invalid Keyboard Type");
                return;
            }
            i12 = 8194;
        }
        editorInfo.inputType = i12;
        if (!z11 && (i12 & 1) == 1) {
            editorInfo.inputType = 131072 | i12;
            if (mVar.f37693e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i15 = editorInfo.inputType;
        if ((i15 & 1) == 1) {
            int i16 = mVar.f37690b;
            if (i16 == 1) {
                editorInfo.inputType = i15 | 4096;
            } else if (i16 == 2) {
                editorInfo.inputType = i15 | 8192;
            } else if (i16 == 3) {
                editorInfo.inputType = i15 | BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
            }
            if (mVar.f37691c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i17 = m5.t0.f29649c;
        editorInfo.initialSelStart = (int) (j9 >> 32);
        editorInfo.initialSelEnd = (int) (j9 & 4294967295L);
        o00.x0.D(editorInfo, charSequence);
        editorInfo.imeOptions |= 33554432;
        if (!u2.d.f40640a || i14 == 7 || i14 == 8) {
            o00.x0.E(editorInfo, false);
        } else {
            o00.x0.E(editorInfo, true);
            p.b(editorInfo);
        }
    }
}
