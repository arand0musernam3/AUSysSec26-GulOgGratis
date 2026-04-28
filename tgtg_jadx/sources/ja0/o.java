package ja0;

import a60.r;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import ia0.a0;
import ia0.d0;
import j4.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = a0.f23602b;
        a0 a0VarS = n20.f.s(ExpiryDateInput.SEPARATOR);
        LinkedHashMap linkedHashMapF = x0.f(new Pair(a0VarS, new l(a0VarS, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (l lVar : CollectionsKt.l0(arrayList, new r(14))) {
            if (((l) linkedHashMapF.put(lVar.f24817a, lVar)) == null) {
                while (true) {
                    a0 a0Var = lVar.f24817a;
                    a0 a0VarD = a0Var.d();
                    if (a0VarD != null) {
                        l lVar2 = (l) linkedHashMapF.get(a0VarD);
                        if (lVar2 != null) {
                            lVar2.f24832q.add(a0Var);
                            break;
                        }
                        l lVar3 = new l(a0VarD, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapF.put(a0VarD, lVar3);
                        lVar3.f24832q.add(a0Var);
                        lVar = lVar3;
                    }
                }
            }
        }
        return linkedHashMapF;
    }

    public static final String b(int i11) {
        StringBuilder sb2 = new StringBuilder("0x");
        String string = Integer.toString(i11, CharsKt.checkRadix(16));
        string.getClass();
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:65|69|127|70|(4:73|(3:75|(2:77|145)(1:144)|80)(3:143|81|82)|(4:93|123|94|95)(1:96)|71)|134|83|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01be, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r14 != (r10.u() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r0 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r9 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        r10.skip(4);
        r16 = ((long) r10.r()) & 4294967295L;
        r13 = r10.u() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r12 = new ja0.h(r13, r14, r16);
        r10.A(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r10.close();
        r4 = r4 - ((long) 20);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r4 <= r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r5 = new ia0.d0(r3.a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (r5.r() != 117853008) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r4 = r5.r();
        r8 = r5.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r5.r() != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r4 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r6 = new ia0.d0(r3.a(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r4 = r6.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r4 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r6.skip(12);
        r4 = r6.r();
        r8 = r6.r();
        r22 = r6.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r22 != r6.t()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r4 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r8 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r6.skip(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        throw new java.io.IOException("bad zip: expected " + b(101075792) + " but was " + b(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        u70.e.a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        u70.e.a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019b, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r0 = r10.u() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r9 = r10.u() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r14 = r10.u() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124), top: B:121:0x0091, outer: #10, inners: #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d A[Catch: all -> 0x014e, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0024, B:16:0x007c, B:18:0x0088, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a8, B:96:0x01b5, B:90:0x01a2, B:103:0x01c3, B:106:0x01d1, B:107:0x01d8, B:108:0x01d9, B:109:0x01dc, B:110:0x01dd, B:111:0x01f2, B:87:0x019d, B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:59:0x0141, B:70:0x0162, B:73:0x0168, B:75:0x0174, B:77:0x0182, B:80:0x0189, B:81:0x018e, B:82:0x0195, B:7:0x002d, B:9:0x0036, B:15:0x005d, B:100:0x01b9, B:101:0x01be), top: B:136:0x000d, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a8 A[Catch: all -> 0x014e, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0024, B:16:0x007c, B:18:0x0088, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a8, B:96:0x01b5, B:90:0x01a2, B:103:0x01c3, B:106:0x01d1, B:107:0x01d8, B:108:0x01d9, B:109:0x01dc, B:110:0x01dd, B:111:0x01f2, B:87:0x019d, B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:59:0x0141, B:70:0x0162, B:73:0x0168, B:75:0x0174, B:77:0x0182, B:80:0x0189, B:81:0x018e, B:82:0x0195, B:7:0x002d, B:9:0x0036, B:15:0x005d, B:100:0x01b9, B:101:0x01be), top: B:136:0x000d, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5 A[Catch: all -> 0x014e, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0024, B:16:0x007c, B:18:0x0088, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a8, B:96:0x01b5, B:90:0x01a2, B:103:0x01c3, B:106:0x01d1, B:107:0x01d8, B:108:0x01d9, B:109:0x01dc, B:110:0x01dd, B:111:0x01f2, B:87:0x019d, B:19:0x0091, B:21:0x009a, B:24:0x00ab, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:59:0x0141, B:70:0x0162, B:73:0x0168, B:75:0x0174, B:77:0x0182, B:80:0x0189, B:81:0x018e, B:82:0x0195, B:7:0x002d, B:9:0x0036, B:15:0x005d, B:100:0x01b9, B:101:0x01be), top: B:136:0x000d, inners: #0, #1, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ia0.m0 c(ia0.a0 r26, ia0.m r27, kotlin.jvm.functions.Function1 r28) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja0.o.c(ia0.a0, ia0.m, kotlin.jvm.functions.Function1):ia0.m0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l d(final d0 d0Var) throws IOException {
        int iR = d0Var.r();
        if (iR != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iR));
        }
        d0Var.skip(4L);
        short sU = d0Var.u();
        int i11 = sU & HPKE.aead_EXPORT_ONLY;
        if ((sU & 1) != 0) {
            i4.a.k("unsupported zip: general purpose bit flag=".concat(b(i11)));
            return null;
        }
        int iU = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        int iU2 = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        int iU3 = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        long jR = ((long) d0Var.r()) & 4294967295L;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((long) d0Var.r()) & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ((long) d0Var.r()) & 4294967295L;
        int iU4 = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        int iU5 = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        int iU6 = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        d0Var.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = ((long) d0Var.r()) & 4294967295L;
        String strA = d0Var.A(iU4);
        if (StringsKt.A(strA, (char) 0)) {
            i4.a.k("bad zip: filename contains 0x00");
            return null;
        }
        long j9 = longRef2.element == 4294967295L ? 8 : 0L;
        if (longRef.element == 4294967295L) {
            j9 += (long) 8;
        }
        if (longRef3.element == 4294967295L) {
            j9 += (long) 8;
        }
        final long j11 = j9;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        e(d0Var, iU5, new Function2() { // from class: ja0.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                d0 d0Var2 = d0Var;
                if (iIntValue == 1) {
                    Ref.BooleanRef booleanRef2 = booleanRef;
                    if (booleanRef2.element) {
                        i4.a.k("bad zip: zip64 extra repeated");
                        return null;
                    }
                    booleanRef2.element = true;
                    if (jLongValue < j11) {
                        i4.a.k("bad zip: zip64 extra too short");
                        return null;
                    }
                    Ref.LongRef longRef4 = longRef2;
                    long jT = longRef4.element;
                    if (jT == 4294967295L) {
                        jT = d0Var2.t();
                    }
                    longRef4.element = jT;
                    Ref.LongRef longRef5 = longRef;
                    longRef5.element = longRef5.element == 4294967295L ? d0Var2.t() : 0L;
                    Ref.LongRef longRef6 = longRef3;
                    longRef6.element = longRef6.element == 4294967295L ? d0Var2.t() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        i4.a.k("bad zip: NTFS extra too short");
                        return null;
                    }
                    d0Var2.skip(4L);
                    o.e(d0Var2, (int) (jLongValue - 4), new m(objectRef, d0Var2, objectRef2, objectRef3));
                }
                return Unit.f26487a;
            }
        });
        if (j11 > 0 && !booleanRef.element) {
            i4.a.k("bad zip: zip64 extra required but absent");
            return null;
        }
        String strA2 = d0Var.A(iU6);
        String str = a0.f23602b;
        return new l(n20.f.s(ExpiryDateInput.SEPARATOR).f(strA), y.j(strA, ExpiryDateInput.SEPARATOR, false), strA2, jR, longRef.element, longRef2.element, iU, longRef3.element, iU3, iU2, (Long) objectRef.element, (Long) objectRef2.element, (Long) objectRef3.element, 57344);
    }

    public static final void e(d0 d0Var, int i11, Function2 function2) throws IOException {
        ia0.g gVar = d0Var.f23623b;
        long j9 = i11;
        while (j9 != 0) {
            if (j9 < 4) {
                i4.a.k("bad zip: truncated header in extra field");
                return;
            }
            int iU = d0Var.u() & HPKE.aead_EXPORT_ONLY;
            long jU = ((long) d0Var.u()) & 65535;
            long j11 = j9 - ((long) 4);
            if (j11 < jU) {
                i4.a.k("bad zip: truncated value in extra field");
                return;
            }
            d0Var.r0(jU);
            long j12 = gVar.f23643b;
            function2.invoke(Integer.valueOf(iU), Long.valueOf(jU));
            long j13 = (gVar.f23643b + jU) - j12;
            if (j13 < 0) {
                i4.a.k(s.f(iU, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j13 > 0) {
                    gVar.skip(j13);
                }
                j9 = j11 - jU;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l f(d0 d0Var, l lVar) {
        int iR = d0Var.r();
        if (iR != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iR));
        }
        d0Var.skip(2L);
        short sU = d0Var.u();
        int i11 = sU & HPKE.aead_EXPORT_ONLY;
        if ((sU & 1) != 0) {
            i4.a.k("unsupported zip: general purpose bit flag=".concat(b(i11)));
            return null;
        }
        d0Var.skip(18L);
        long jU = ((long) d0Var.u()) & 65535;
        int iU = d0Var.u() & HPKE.aead_EXPORT_ONLY;
        d0Var.skip(jU);
        if (lVar == null) {
            d0Var.skip(iU);
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        e(d0Var, iU, new m(d0Var, objectRef, objectRef2, objectRef3));
        return new l(lVar.f24817a, lVar.f24818b, lVar.f24819c, lVar.f24820d, lVar.f24821e, lVar.f24822f, lVar.f24823g, lVar.f24824h, lVar.f24825i, lVar.f24826j, lVar.f24827k, lVar.l, lVar.f24828m, (Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element);
    }
}
