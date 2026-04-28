package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i5 implements d10.b, qz.q, j30.l, vd, o30.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11488c;

    public i5(int i11) {
        this.f11486a = i11;
        switch (i11) {
            case 6:
                break;
            case 10:
                this.f11487b = new TreeMap();
                this.f11488c = new TreeMap();
                break;
            default:
                this.f11487b = new HashMap();
                this.f11488c = new h5(6);
                h5 h5Var = new h5(0);
                l5 l5Var = l5.BITWISE_AND;
                ArrayList arrayList = h5Var.f11456a;
                arrayList.add(l5Var);
                arrayList.add(l5.BITWISE_LEFT_SHIFT);
                arrayList.add(l5.BITWISE_NOT);
                arrayList.add(l5.BITWISE_OR);
                arrayList.add(l5.BITWISE_RIGHT_SHIFT);
                arrayList.add(l5.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(l5.BITWISE_XOR);
                c(h5Var);
                h5 h5Var2 = new h5(1);
                l5 l5Var2 = l5.EQUALS;
                ArrayList arrayList2 = h5Var2.f11456a;
                arrayList2.add(l5Var2);
                arrayList2.add(l5.GREATER_THAN);
                arrayList2.add(l5.GREATER_THAN_EQUALS);
                arrayList2.add(l5.IDENTITY_EQUALS);
                arrayList2.add(l5.IDENTITY_NOT_EQUALS);
                arrayList2.add(l5.LESS_THAN);
                arrayList2.add(l5.LESS_THAN_EQUALS);
                arrayList2.add(l5.NOT_EQUALS);
                c(h5Var2);
                h5 h5Var3 = new h5(2);
                l5 l5Var3 = l5.APPLY;
                ArrayList arrayList3 = h5Var3.f11456a;
                arrayList3.add(l5Var3);
                arrayList3.add(l5.BLOCK);
                arrayList3.add(l5.BREAK);
                arrayList3.add(l5.CASE);
                arrayList3.add(l5.DEFAULT);
                arrayList3.add(l5.CONTINUE);
                arrayList3.add(l5.DEFINE_FUNCTION);
                arrayList3.add(l5.FN);
                arrayList3.add(l5.IF);
                arrayList3.add(l5.QUOTE);
                arrayList3.add(l5.RETURN);
                arrayList3.add(l5.SWITCH);
                arrayList3.add(l5.TERNARY);
                c(h5Var3);
                h5 h5Var4 = new h5(3);
                l5 l5Var4 = l5.AND;
                ArrayList arrayList4 = h5Var4.f11456a;
                arrayList4.add(l5Var4);
                arrayList4.add(l5.NOT);
                arrayList4.add(l5.OR);
                c(h5Var4);
                h5 h5Var5 = new h5(4);
                l5 l5Var5 = l5.FOR_IN;
                ArrayList arrayList5 = h5Var5.f11456a;
                arrayList5.add(l5Var5);
                arrayList5.add(l5.FOR_IN_CONST);
                arrayList5.add(l5.FOR_IN_LET);
                arrayList5.add(l5.FOR_LET);
                arrayList5.add(l5.FOR_OF);
                arrayList5.add(l5.FOR_OF_CONST);
                arrayList5.add(l5.FOR_OF_LET);
                arrayList5.add(l5.WHILE);
                c(h5Var5);
                h5 h5Var6 = new h5(5);
                l5 l5Var6 = l5.ADD;
                ArrayList arrayList6 = h5Var6.f11456a;
                arrayList6.add(l5Var6);
                arrayList6.add(l5.DIVIDE);
                arrayList6.add(l5.MODULUS);
                arrayList6.add(l5.MULTIPLY);
                arrayList6.add(l5.NEGATE);
                arrayList6.add(l5.POST_DECREMENT);
                arrayList6.add(l5.POST_INCREMENT);
                arrayList6.add(l5.PRE_DECREMENT);
                arrayList6.add(l5.PRE_INCREMENT);
                arrayList6.add(l5.SUBTRACT);
                c(h5Var6);
                h5 h5Var7 = new h5(7);
                l5 l5Var7 = l5.ASSIGN;
                ArrayList arrayList7 = h5Var7.f11456a;
                arrayList7.add(l5Var7);
                arrayList7.add(l5.CONST);
                arrayList7.add(l5.CREATE_ARRAY);
                arrayList7.add(l5.CREATE_OBJECT);
                arrayList7.add(l5.EXPRESSION_LIST);
                arrayList7.add(l5.GET);
                arrayList7.add(l5.GET_INDEX);
                arrayList7.add(l5.GET_PROPERTY);
                arrayList7.add(l5.NULL);
                arrayList7.add(l5.SET_PROPERTY);
                arrayList7.add(l5.TYPEOF);
                arrayList7.add(l5.UNDEFINED);
                arrayList7.add(l5.VAR);
                c(h5Var7);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public Object a(ud udVar) throws IOException {
        Uri uri = udVar.f11942d;
        AtomicLong atomicLong = je.f11524a;
        int iMyPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = je.f11524a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id2).length();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb2.append(".mobstore_tmp-");
        sb2.append(iMyPid);
        sb2.append("-");
        sb2.append(id2);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "-", jCurrentTimeMillis, "-");
        sb2.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb2.toString())).build();
        ke keVar = udVar.f11939a;
        ArrayList arrayListA = udVar.a(keVar.d(uriBuild));
        i5[] i5VarArr = (i5[]) this.f11488c;
        if (i5VarArr != null) {
            i5VarArr[0].d(arrayListA);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListA.get(0);
            try {
                ((n0) this.f11487b).b(outputStream);
                i5[] i5VarArr2 = (i5[]) this.f11488c;
                if (i5VarArr2 != null) {
                    i5 i5Var = i5VarArr2[0];
                    if (((ee) i5Var.f11488c) == null) {
                        throw new zzsk("Cannot sync underlying stream");
                    }
                    ((OutputStream) i5Var.f11487b).flush();
                    ((ee) i5Var.f11488c).f11390a.getFD().sync();
                }
                outputStream.close();
                keVar.g(uriBuild, uri);
                return null;
            } finally {
            }
        } catch (Exception e5) {
            try {
                keVar.f(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e5 instanceof IOException) {
                throw ((IOException) e5);
            }
            throw new IOException(e5);
        }
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        int i11 = aa.f11252a;
        y9 y9Var = new y9((d10.g) obj2);
        ba baVar = (ba) ((ca) obj).getService();
        String[] strArr = (String[]) this.f11488c;
        String str = (String) this.f11487b;
        Parcel parcelL = baVar.L();
        o5.c(parcelL, y9Var);
        parcelL.writeString(str);
        parcelL.writeInt(0);
        parcelL.writeStringArray(strArr);
        parcelL.writeByteArray(null);
        baVar.M(1, parcelL);
    }

    public fc b(String str, int i11, boolean z11) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f11487b;
        fc fcVar = (fc) atomicReferenceArray.get(i11);
        if (fcVar != null) {
            return fcVar;
        }
        bc bcVarC = ((s5) this.f11488c).c(str, z11);
        while (!atomicReferenceArray.compareAndSet(i11, null, bcVarC)) {
            if (atomicReferenceArray.get(i11) != null) {
                fc fcVar2 = (fc) atomicReferenceArray.get(i11);
                fcVar2.getClass();
                return fcVar2;
            }
        }
        return bcVarC;
    }

    public void c(h5 h5Var) {
        Iterator it = h5Var.f11456a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f11487b).put(((l5) it.next()).c().toString(), h5Var);
        }
    }

    @Override // o30.a0
    public ListenableFuture call() {
        switch (this.f11486a) {
            case 8:
                oe oeVar = (oe) this.f11488c;
                String strValueOf = String.valueOf(oeVar.f11723a);
                h1 h1Var = oeVar.f11730h;
                String strConcat = "Initialize ".concat(strValueOf);
                bg bgVar = bg.zza;
                h1Var.getClass();
                pf pfVarD = h1.d(strConcat, bgVar);
                try {
                    synchronized (oeVar.f11729g) {
                        try {
                            if (((List) this.f11487b) == null) {
                                this.f11487b = oeVar.f11731i;
                                oeVar.f11731i = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    ArrayList arrayList = new ArrayList(((List) this.f11487b).size());
                    ue ueVar = new ue((oe) this.f11488c);
                    Iterator it = ((List) this.f11487b).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((o30.b0) it.next()).apply(ueVar));
                        } catch (Exception e5) {
                            arrayList.add(o30.o0.c(e5));
                        }
                    }
                    k30.h hVarL = k30.h.l(arrayList);
                    a aVar = new a(this, 2);
                    o30.g0 g0Var = o30.g0.INSTANCE;
                    o30.d0 d0Var = new o30.d0(hVarL, true);
                    d0Var.f31867n = new o30.c0(d0Var, aVar, g0Var, 1);
                    d0Var.s();
                    pfVarD.a(d0Var);
                    pfVarD.close();
                    return d0Var;
                } catch (Throwable th3) {
                    try {
                        pfVarD.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                yf yfVar = (yf) this.f11487b;
                xf xfVarC = hf.c();
                yf yfVarB = hf.b(xfVarC, yfVar);
                try {
                    ListenableFuture listenableFutureCall = ((o30.a0) this.f11488c).call();
                    hf.b(xfVarC, yfVarB);
                    listenableFutureCall.getClass();
                    return listenableFutureCall;
                } finally {
                }
        }
    }

    public void d(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) jf.e.G(arrayList);
        if (outputStream instanceof ee) {
            this.f11488c = (ee) outputStream;
            this.f11487b = (OutputStream) arrayList.get(0);
        }
    }

    public c5 e(b7 b7Var, c5 c5Var) {
        fa.y(b7Var);
        if (!(c5Var instanceof d5)) {
            return c5Var;
        }
        d5 d5Var = (d5) c5Var;
        ArrayList arrayList = d5Var.f11340b;
        String str = d5Var.f11339a;
        HashMap map = (HashMap) this.f11487b;
        return (map.containsKey(str) ? (h5) map.get(str) : (h5) this.f11488c).a(str, b7Var, arrayList);
    }

    public fc f(int i11, long j9, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f11487b;
        fc fcVar = (fc) atomicReferenceArray.get(i11);
        if (fcVar != null) {
            return fcVar;
        }
        dc dcVar = new dc(str, (rc) ((s5) this.f11488c).f11844b, j9);
        while (!atomicReferenceArray.compareAndSet(i11, null, dcVar)) {
            if (atomicReferenceArray.get(i11) != null) {
                fc fcVar2 = (fc) atomicReferenceArray.get(i11);
                fcVar2.getClass();
                return fcVar2;
            }
        }
        return dcVar;
    }

    @Override // d10.b
    public Object g(Task task) {
        boolean z11 = task.getException() instanceof UnsupportedApiCallException;
        za zaVar = (za) this.f11488c;
        aa aaVar = (aa) this.f11487b;
        if (z11) {
            return aaVar.c(zaVar.t());
        }
        if (!(task.getException() instanceof ApiException)) {
            return task;
        }
        ApiException apiException = (ApiException) task.getException();
        apiException.getClass();
        return apiException.f11049a.f11059a == 29514 ? aaVar.c(zaVar.t()) : task;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // j30.l
    public Object get() {
        long j9;
        char c3;
        long j11;
        long j12;
        char c7;
        long j13;
        char c8;
        long j14;
        char c11;
        long j15;
        long j16;
        char c12;
        char c13;
        switch (this.f11486a) {
            case 3:
                a8.h hVar = (a8.h) this.f11487b;
                String str = (String) this.f11488c;
                int i11 = l30.c.f27262a;
                int i12 = l30.e.f27269h;
                l30.d dVarC = new l30.d().c(str.getBytes());
                ByteBuffer byteBuffer = dVarC.f27263a;
                byteBuffer.put((byte) 0);
                if (byteBuffer.remaining() < 8) {
                    dVarC.a();
                }
                l30.d dVarC2 = dVarC.c("".getBytes());
                dVarC2.a();
                ByteBuffer byteBuffer2 = dVarC2.f27263a;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    dVarC2.f27268f = byteBuffer2.remaining() + dVarC2.f27268f;
                    long j17 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            j9 = 0;
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 2:
                            c3 = '\b';
                            j11 = 0;
                            j9 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c3);
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 3:
                            c3 = '\b';
                            j12 = 0;
                            j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j9 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c3);
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 4:
                            c3 = '\b';
                            c7 = 24;
                            j13 = 0;
                            j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c7);
                            j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j9 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c3);
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 5:
                            c3 = '\b';
                            c8 = ' ';
                            c7 = 24;
                            j14 = 0;
                            j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << c8);
                            j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c7);
                            j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j9 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c3);
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 6:
                            c11 = 24;
                            c8 = ' ';
                            j15 = 0;
                            c3 = '\b';
                            c7 = c11;
                            j14 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j15;
                            j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << c8);
                            j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c7);
                            j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j9 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c3);
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 7:
                            c11 = 24;
                            c8 = ' ';
                            j15 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                            c3 = '\b';
                            c7 = c11;
                            j14 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j15;
                            j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << c8);
                            j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c7);
                            j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                            j9 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c3);
                            j16 = j9 ^ ((long) (byteBuffer2.get(0) & 255));
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 8:
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 9:
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 10:
                            j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 11:
                            j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 12:
                            c12 = 24;
                            j17 ^= ((long) (byteBuffer2.get(11) & 255)) << c12;
                            j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 13:
                            c12 = 24;
                            c13 = ' ';
                            j17 ^= ((long) (byteBuffer2.get(12) & 255)) << c13;
                            j17 ^= ((long) (byteBuffer2.get(11) & 255)) << c12;
                            j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 14:
                            c12 = 24;
                            c13 = ' ';
                            j17 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j17 ^= ((long) (byteBuffer2.get(12) & 255)) << c13;
                            j17 ^= ((long) (byteBuffer2.get(11) & 255)) << c12;
                            j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            j17 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                            c12 = 24;
                            c13 = ' ';
                            j17 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                            j17 ^= ((long) (byteBuffer2.get(12) & 255)) << c13;
                            j17 ^= ((long) (byteBuffer2.get(11) & 255)) << c12;
                            j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                            j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                            j17 ^= (long) (byteBuffer2.get(8) & 255);
                            j16 = byteBuffer2.getLong();
                            dVarC2.f27266d = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dVarC2.f27266d;
                            dVarC2.f27267e ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        default:
                            i4.a.d("Should never get here.");
                            return null;
                    }
                }
                long j18 = dVarC2.f27266d;
                long j19 = dVarC2.f27268f;
                long j21 = j18 ^ j19;
                long j22 = j19 ^ dVarC2.f27267e;
                long j23 = j21 + j22;
                long j24 = j22 + j23;
                long j25 = (j23 ^ (j23 >>> 33)) * (-49064778989728563L);
                long j26 = (j25 ^ (j25 >>> 33)) * (-4265267296055464877L);
                long j27 = (j24 ^ (j24 >>> 33)) * (-49064778989728563L);
                long j28 = (j27 ^ (j27 >>> 33)) * (-4265267296055464877L);
                long j29 = j28 ^ (j28 >>> 33);
                long j31 = (j26 ^ (j26 >>> 33)) + j29;
                dVarC2.f27266d = j31;
                dVarC2.f27267e = j29 + j31;
                byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(dVarC2.f27266d).putLong(dVarC2.f27267e).array();
                char[] cArr = l30.b.f27261a;
                new l30.a(bArrArray);
                return ((m30.c) hVar.f973b).a((byte[]) bArrArray.clone());
            default:
                return ((m30.c) ((a8.h) this.f11487b).f973b).a(((u0) this.f11488c).m());
        }
    }

    public void h(b7 b7Var, a8.h hVar) {
        ha haVar = new ha(hVar);
        TreeMap treeMap = (TreeMap) this.f11487b;
        for (Integer num : treeMap.keySet()) {
            b bVarA = ((b) hVar.f974c).clone();
            c5 c5VarA = ((b5) treeMap.get(num)).a(b7Var, Collections.singletonList(haVar));
            int iP = c5VarA instanceof i3 ? fa.p(((i3) c5VarA).f11484a.doubleValue()) : -1;
            if (iP == 2 || iP == -1) {
                hVar.f974c = bVarA;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f11488c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c5 c5VarA2 = ((b5) treeMap2.get((Integer) it.next())).a(b7Var, Collections.singletonList(haVar));
            if (c5VarA2 instanceof i3) {
                fa.p(((i3) c5VarA2).f11484a.doubleValue());
            }
        }
    }

    public fc i(int i11, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f11487b;
        fc fcVar = (fc) atomicReferenceArray.get(i11);
        if (fcVar != null) {
            return fcVar;
        }
        ec ecVar = new ec(str, (rc) ((s5) this.f11488c).f11844b, str2);
        while (!atomicReferenceArray.compareAndSet(i11, null, ecVar)) {
            if (atomicReferenceArray.get(i11) != null) {
                fc fcVar2 = (fc) atomicReferenceArray.get(i11);
                fcVar2.getClass();
                return fcVar2;
            }
        }
        return ecVar;
    }

    public String toString() {
        switch (this.f11486a) {
            case 9:
                o30.a0 a0Var = (o30.a0) this.f11488c;
                StringBuilder sb2 = new StringBuilder(a0Var.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(a0Var);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public i5(n0 n0Var) {
        this.f11486a = 7;
        this.f11487b = n0Var;
    }

    public /* synthetic */ i5(int i11, Object obj, Object obj2) {
        this.f11486a = i11;
        this.f11487b = obj;
        this.f11488c = obj2;
    }

    public i5(s5 s5Var, int i11) {
        this.f11486a = 5;
        this.f11488c = s5Var;
        this.f11487b = new AtomicReferenceArray(i11);
    }

    public /* synthetic */ i5(oe oeVar) {
        this.f11486a = 8;
        this.f11488c = oeVar;
    }
}
