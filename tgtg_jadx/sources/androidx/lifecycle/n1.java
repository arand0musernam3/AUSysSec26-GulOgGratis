package androidx.lifecycle;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.n1;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.internal.measurement.te;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import v80.b2;
import y80.a2;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements u70.j, m5.v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f3498f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3503e;

    public n1(m5.h hVar, m5.u0 u0Var, List list, z5.c cVar, q5.h hVar2) {
        int i11;
        ArrayList arrayList;
        String str;
        List list2;
        m5.h hVar3 = hVar;
        m5.u0 u0Var2 = u0Var;
        this.f3499a = hVar3;
        this.f3500b = list;
        u70.m mVar = u70.m.NONE;
        final int i12 = 0;
        this.f3501c = u70.l.a(mVar, new Function0(this) { // from class: m5.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f29636b;

            {
                this.f29636b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f29636b.f3503e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fB = ((u) obj3).f29651a.b();
                            int i13 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i13);
                                    float fB2 = ((u) obj4).f29651a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i13 != size) {
                                        i13++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        u uVar = (u) obj;
                        return Float.valueOf(uVar != null ? uVar.f29651a.b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f29636b.f3503e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((u) obj5).f29651a.f40775i.c();
                            int i14 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i14);
                                    float fC2 = ((u) obj6).f29651a.f40775i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i14 != size2) {
                                        i14++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        u uVar2 = (u) obj2;
                        return Float.valueOf(uVar2 != null ? uVar2.f29651a.f40775i.c() : 0.0f);
                }
            }
        });
        final int i13 = 1;
        this.f3502d = u70.l.a(mVar, new Function0(this) { // from class: m5.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f29636b;

            {
                this.f29636b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f29636b.f3503e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fB = ((u) obj3).f29651a.b();
                            int i132 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i132);
                                    float fB2 = ((u) obj4).f29651a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i132 != size) {
                                        i132++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        u uVar = (u) obj;
                        return Float.valueOf(uVar != null ? uVar.f29651a.b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f29636b.f3503e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((u) obj5).f29651a.f40775i.c();
                            int i14 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i14);
                                    float fC2 = ((u) obj6).f29651a.f40775i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i14 != size2) {
                                        i14++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        u uVar2 = (u) obj2;
                        return Float.valueOf(uVar2 != null ? uVar2.f29651a.f40775i.c() : 0.0f);
                }
            }
        });
        m5.w wVar = u0Var2.f29656b;
        m5.h hVar4 = m5.i.f29541a;
        ArrayList arrayList2 = hVar3.f29540d;
        String str2 = hVar3.f29538b;
        List listL0 = (arrayList2 == null || (listL0 = CollectionsKt.l0(arrayList2, new m5.g(i13))) == null) ? kotlin.collections.n0.f26529a : listL0;
        ArrayList arrayList3 = new ArrayList();
        kotlin.collections.t tVar = new kotlin.collections.t();
        int size = listL0.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            m5.f fVar = (m5.f) listL0.get(i14);
            m5.f fVarA = m5.f.a(fVar, wVar.a((m5.w) fVar.f29529a), i12, i12, 14);
            Object obj = fVarA.f29529a;
            int i16 = fVarA.f29531c;
            int i17 = fVarA.f29530b;
            while (i15 < i17 && !tVar.isEmpty()) {
                m5.f fVar2 = (m5.f) tVar.last();
                int i18 = fVar2.f29531c;
                List list3 = listL0;
                Object obj2 = fVar2.f29529a;
                if (i17 < i18) {
                    arrayList3.add(new m5.f(obj2, i15, i17));
                    i15 = i17;
                    listL0 = list3;
                } else {
                    int i19 = size;
                    arrayList3.add(new m5.f(obj2, i15, i18));
                    i15 = fVar2.f29531c;
                    while (!tVar.isEmpty() && i15 == ((m5.f) tVar.last()).f29531c) {
                        tVar.removeLast();
                    }
                    listL0 = list3;
                    size = i19;
                }
            }
            List list4 = listL0;
            int i21 = size;
            if (i15 < i17) {
                arrayList3.add(new m5.f(wVar, i15, i17));
                i15 = i17;
            }
            m5.f fVar3 = (m5.f) tVar.j();
            if (fVar3 != null) {
                int i22 = fVar3.f29531c;
                Object obj3 = fVar3.f29529a;
                int i23 = fVar3.f29530b;
                if (i23 == i17 && i22 == i16) {
                    tVar.removeLast();
                    tVar.addLast(new m5.f(((m5.w) obj3).a((m5.w) obj), i17, i16));
                } else if (i23 == i22) {
                    arrayList3.add(new m5.f(obj3, i23, i22));
                    tVar.removeLast();
                    tVar.addLast(new m5.f(obj, i17, i16));
                } else {
                    if (i22 < i16) {
                        i4.a.h();
                        throw null;
                    }
                    tVar.addLast(new m5.f(((m5.w) obj3).a((m5.w) obj), i17, i16));
                }
            } else {
                tVar.addLast(new m5.f(obj, i17, i16));
            }
            i14++;
            listL0 = list4;
            size = i21;
            i12 = 0;
        }
        while (i15 <= str2.length() && !tVar.isEmpty()) {
            m5.f fVar4 = (m5.f) tVar.last();
            Object obj4 = fVar4.f29529a;
            int i24 = fVar4.f29531c;
            arrayList3.add(new m5.f(obj4, i15, i24));
            while (!tVar.isEmpty() && i24 == ((m5.f) tVar.last()).f29531c) {
                tVar.removeLast();
            }
            i15 = i24;
        }
        if (i15 < str2.length()) {
            arrayList3.add(new m5.f(wVar, i15, str2.length()));
        }
        if (arrayList3.isEmpty()) {
            i11 = 0;
            arrayList3.add(new m5.f(wVar, 0, 0));
        } else {
            i11 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i25 = i11;
        while (i25 < size2) {
            m5.f fVar5 = (m5.f) arrayList3.get(i25);
            int i26 = fVar5.f29530b;
            int i27 = fVar5.f29531c;
            String strSubstring = i26 != i27 ? str2.substring(i26, i27) : "";
            List listA = m5.i.a(hVar3, i26, i27, new m2.p1(7));
            m5.h hVar5 = new m5.h(strSubstring, listA == null ? kotlin.collections.n0.f26529a : listA);
            m5.w wVar2 = (m5.w) fVar5.f29529a;
            if (wVar2.f29659b == 0) {
                arrayList = arrayList3;
                str = str2;
                wVar2 = new m5.w(wVar2.f29658a, wVar.f29659b, wVar2.f29660c, wVar2.f29661d, wVar2.f29662e, wVar2.f29663f, wVar2.f29664g, wVar2.f29665h, wVar2.f29666i);
            } else {
                arrayList = arrayList3;
                str = str2;
            }
            m5.u0 u0Var3 = new m5.u0(u0Var2.f29655a, wVar.a(wVar2));
            List list5 = hVar5.f29537a;
            List list6 = list5 == null ? kotlin.collections.n0.f26529a : list5;
            List list7 = (List) this.f3500b;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i28 = 0;
            while (i28 < size3) {
                m5.f fVar6 = (m5.f) list7.get(i28);
                int i29 = fVar6.f29530b;
                m5.w wVar3 = wVar;
                int i31 = fVar6.f29531c;
                if (m5.i.b(i26, i27, i29, i31)) {
                    if (i26 > i29 || i31 > i27) {
                        s5.a.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList5.add(new m5.f(fVar6.f29529a, i29 - i26, i31 - i26));
                } else {
                    list2 = list7;
                }
                i28++;
                list7 = list2;
                wVar = wVar3;
            }
            arrayList4.add(new m5.u(new u5.d(strSubstring, u0Var3, list6, arrayList5, hVar2, cVar), i26, i27));
            i25++;
            hVar3 = hVar;
            u0Var2 = u0Var;
            str2 = str;
            arrayList3 = arrayList;
        }
        this.f3503e = arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r8.invoke(r1, r2) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r4 == r1.f26542c) goto L22;
     */
    /* JADX WARN: Path cross not found for [B:22:0x0044, B:26:0x0050], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007a, B:26:0x0050, B:28:0x0056, B:29:0x005a, B:31:0x005e, B:32:0x0069, B:22:0x0044, B:25:0x004d, B:19:0x003d), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007a, B:26:0x0050, B:28:0x0056, B:29:0x005a, B:31:0x005e, B:32:0x0069, B:22:0x0044, B:25:0x004d, B:19:0x003d), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007a, B:26:0x0050, B:28:0x0056, B:29:0x005a, B:31:0x005e, B:32:0x0069, B:22:0x0044, B:25:0x004d, B:19:0x003d), top: B:40:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0077 -> B:35:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a d(androidx.lifecycle.n1 r7, z70.c r8) {
        /*
            java.lang.Object r0 = r7.f3502d
            x80.i r0 = (x80.i) r0
            java.lang.Object r1 = r7.f3503e
            kotlin.collections.t r1 = (kotlin.collections.t) r1
            boolean r2 = r8 instanceof h0.i
            if (r2 == 0) goto L1b
            r2 = r8
            h0.i r2 = (h0.i) r2
            int r3 = r2.f20976m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f20976m = r3
            goto L20
        L1b:
            h0.i r2 = new h0.i
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.f20975k
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.f20976m
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L36
            int r4 = r2.f20974j
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L34
            goto L7a
        L34:
            r8 = move-exception
            goto L7f
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L3d:
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L34
            goto L4d
        L41:
            ba0.g.M(r8)
        L44:
            r2.f20976m = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.b(r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L4d
            goto L79
        L4d:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L50:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L44
            java.lang.Object r8 = r0.d()     // Catch: java.lang.Throwable -> L34
        L5a:
            boolean r4 = r8 instanceof x80.o     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L69
            x80.p.b(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.d()     // Catch: java.lang.Throwable -> L34
            goto L5a
        L69:
            int r4 = r1.f26542c     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.f3500b     // Catch: java.lang.Throwable -> L34
            c6.y r8 = (c6.y) r8     // Catch: java.lang.Throwable -> L34
            r2.f20974j = r4     // Catch: java.lang.Throwable -> L34
            r2.f20976m = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.invoke(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L7a
        L79:
            return r3
        L7a:
            int r8 = r1.f26542c     // Catch: java.lang.Throwable -> L34
            if (r4 != r8) goto L50
            goto L44
        L7f:
            r7.x(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.n1.d(androidx.lifecycle.n1, z70.c):y70.a");
    }

    public static n1 l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        n1 n1Var = new n1();
        n1Var.f3502d = new ArrayDeque();
        n1Var.f3499a = sharedPreferences;
        n1Var.f3500b = "topic_operation_queue";
        n1Var.f3501c = MessageLogView.COMMA_SEPARATOR;
        n1Var.f3503e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) n1Var.f3502d)) {
            try {
                ((ArrayDeque) n1Var.f3502d).clear();
                String string = ((SharedPreferences) n1Var.f3499a).getString((String) n1Var.f3500b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) n1Var.f3501c)) {
                    String[] strArrSplit = string.split((String) n1Var.f3501c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) n1Var.f3502d).add(str);
                        }
                    }
                    return n1Var;
                }
                return n1Var;
            } finally {
            }
        }
    }

    public void A(u10.f fVar) {
        FrameLayout frameLayout = (FrameLayout) this.f3500b;
        if (fVar == null) {
            this.f3502d = null;
        } else {
            u10.f fVar2 = (u10.f) this.f3502d;
            if (fVar2 == null) {
                this.f3502d = new u10.f(fVar);
            } else {
                float f11 = fVar.f40632a;
                float f12 = fVar.f40633b;
                float f13 = fVar.f40634c;
                fVar2.f40632a = f11;
                fVar2.f40633b = f12;
                fVar2.f40634c = f13;
            }
            if (fVar.f40634c + 1.0E-4f >= u00.d.s(fVar.f40632a, fVar.f40633b, frameLayout.getWidth(), frameLayout.getHeight())) {
                ((u10.f) this.f3502d).f40634c = Float.MAX_VALUE;
            }
        }
        frameLayout.invalidate();
    }

    public void B(Class cls, Object obj) {
        cls.getClass();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
        orCreateKotlinClass.getClass();
        this.f3503e = ((y9.w) this.f3503e).E(orCreateKotlinClass, obj);
    }

    public boolean C(i0.p pVar) {
        return !(((x80.i) this.f3502d).h(pVar) instanceof x80.o);
    }

    public void D(String str) {
        str.getClass();
        if (kotlin.text.y.p(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (kotlin.text.y.p(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        q90.u uVar = new q90.u();
        uVar.e(null, str);
        this.f3499a = uVar.b();
    }

    public void E() {
        Iterator it = ((ArrayList) this.f3503e).iterator();
        while (it.hasNext()) {
            int i11 = ((g9.w) it.next()).f20248a;
            if (o(i11) == null) {
                int i12 = g9.z.f20256f;
                j4.d.p(e0.f.s("Navigation destination ", g9.x.a((ky.b) this.f3500b, i11), " cannot be found in the navigation graph "), (g9.b0) this.f3502d);
                return;
            }
        }
    }

    @Override // m5.v
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f3503e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((m5.u) arrayList.get(i11)).f29651a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @Override // m5.v
    public float b() {
        return ((Number) this.f3501c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @Override // m5.v
    public float c() {
        return ((Number) this.f3502d.getValue()).floatValue();
    }

    public void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((ax.g0) this.f3501c).c(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi f(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f3499a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f3500b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f3501c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f3502d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f3503e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.t(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f3503e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f3503e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.n1.f(int):java.text.Bidi");
    }

    public s0.l g() {
        String strConcat = ((s0.x0) this.f3499a) == null ? " surface" : "";
        if (((List) this.f3500b) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.f3501c) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.f3502d) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((m0.c0) this.f3503e) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new s0.l((s0.x0) this.f3499a, (List) this.f3500b, ((Integer) this.f3501c).intValue(), ((Integer) this.f3502d).intValue(), (m0.c0) this.f3503e);
        }
        h2.b("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // u70.j
    public Object getValue() {
        l1 l1Var = (l1) this.f3503e;
        if (l1Var != null) {
            return l1Var;
        }
        ViewModelStore viewModelStore = (ViewModelStore) ((Function0) this.f3500b).invoke();
        ViewModelProvider$Factory viewModelProvider$Factory = (ViewModelProvider$Factory) ((Function0) this.f3501c).invoke();
        CreationExtras creationExtras = (CreationExtras) ((Function0) this.f3502d).invoke();
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(viewModelStore, viewModelProvider$Factory, creationExtras);
        KClass kClass = (KClass) this.f3499a;
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
            return null;
        }
        l1 l1VarM = a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), kClass);
        this.f3503e = l1VarM;
        return l1VarM;
    }

    public void h(q90.g gVar) {
        gVar.getClass();
        String string = gVar.toString();
        if (string.length() == 0) {
            ((ax.g0) this.f3501c).i("Cache-Control");
        } else {
            u("Cache-Control", string);
        }
    }

    public void i() {
        m0.e1 e1Var;
        a.a.t();
        q2 q2Var = (q2) this.f3501c;
        q2Var.getClass();
        a.a.t();
        r0.a aVar = (r0.a) q2Var.f48337e;
        Objects.requireNonNull(aVar);
        ld.k kVar = (ld.k) q2Var.f48334b;
        Objects.requireNonNull(kVar);
        ld.k kVar2 = (ld.k) q2Var.f48335c;
        m0.e1 e1Var2 = aVar.f37431c;
        Objects.requireNonNull(e1Var2);
        e1Var2.a();
        m0.e1 e1Var3 = aVar.f37431c;
        Objects.requireNonNull(e1Var3);
        x0.g.d(e1Var3.f38469e).a(new r0.i(kVar, 0), w.b.U());
        m0.e1 e1Var4 = aVar.f37433e;
        if (e1Var4 != null) {
            e1Var4.a();
            x0.g.d(aVar.f37433e.f38469e).a(new r0.i(null, 1), w.b.U());
        }
        if (aVar.f37436h.size() > 1 && (e1Var = aVar.f37432d) != null) {
            e1Var.a();
            x0.g.d(aVar.f37432d.f38469e).a(new r0.i(kVar2, 2), w.b.U());
        }
        ((r0.m) this.f3502d).getClass();
    }

    public f0.x0 j(f0.q1 q1Var, Map map, Map map2) {
        q1Var.getClass();
        map.getClass();
        map2.getClass();
        h0.n nVar = (h0.n) this.f3499a;
        e0.n nVar2 = (e0.n) this.f3500b;
        int i11 = nVar2.f15377i;
        i0.g0 g0Var = (i0.g0) this.f3501c;
        e0.q1 q1Var2 = (e0.q1) this.f3503e;
        f0.n1 n1Var = (f0.n1) this.f3502d;
        n1Var.getClass();
        n1Var.f16785b.getClass();
        nVar2.f15382o.getClass();
        e0.u uVar = e0.v.f15412i0;
        e0.v vVarD = ((f0.k1) n1Var.f16784a).d(nVar2.f15369a);
        uVar.getClass();
        return new f0.x0(q1Var, nVar, i11, map, map2, g0Var, q1Var2, e0.u.c(vVarD));
    }

    public void k(s0.i0 i0Var, s0.i0 i0Var2, c1.n nVar, c1.n nVar2, Map.Entry entry) {
        c1.n nVar3 = (c1.n) entry.getValue();
        wd.a.p("DualSurfaceProcessorNode", "     -> outputEdge = " + nVar3);
        m0.g gVar = new m0.g(nVar.f6902g.f38402a, ((d1.a) entry.getKey()).f13668a.f15440d, nVar.f6898c ? i0Var : null, ((d1.a) entry.getKey()).f13668a.f15442f, ((d1.a) entry.getKey()).f13668a.f15443g);
        m0.g gVar2 = new m0.g(nVar2.f6902g.f38402a, ((d1.a) entry.getKey()).f13669b.f15440d, nVar2.f6898c ? i0Var2 : null, ((d1.a) entry.getKey()).f13669b.f15442f, ((d1.a) entry.getKey()).f13669b.f15443g);
        int i11 = ((d1.a) entry.getKey()).f13668a.f15439c;
        nVar3.getClass();
        a.a.t();
        nVar3.a();
        pd.g.n("Consumer can only be linked once.", !nVar3.f6905j);
        nVar3.f6905j = true;
        c1.m mVar = nVar3.l;
        x0.b bVarF = x0.g.f(mVar.c(), new c1.k(nVar3, mVar, i11, gVar, gVar2), w.b.U());
        bVarF.a(new x0.f(0, bVarF, new w2.z(this, nVar3, false, 26)), w.b.U());
    }

    public TaskStackBuilder m() {
        ArrayList arrayList = (ArrayList) this.f3503e;
        Intent intent = (Intent) this.f3501c;
        g9.b0 b0Var = (g9.b0) this.f3502d;
        if (b0Var == null) {
            h2.b("You must call setGraph() before constructing the deep link");
            return null;
        }
        if (arrayList.isEmpty()) {
            h2.b("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        g9.z zVar = null;
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                intent.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt.q0(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                TaskStackBuilder taskStackBuilder = new TaskStackBuilder((Context) this.f3499a);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(taskStackBuilder.f2575b.getPackageManager());
                }
                if (component != null) {
                    taskStackBuilder.b(component);
                }
                ArrayList arrayList4 = taskStackBuilder.f2574a;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i11 < size) {
                    Intent intent3 = (Intent) arrayList4.get(i11);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i11++;
                }
                return taskStackBuilder;
            }
            g9.w wVar = (g9.w) it.next();
            int i12 = wVar.f20248a;
            Bundle bundle = wVar.f20249b;
            g9.z zVarO = o(i12);
            if (zVarO == null) {
                int i13 = g9.z.f20256f;
                m0.i1.k("Navigation destination ", g9.x.a((ky.b) this.f3500b, i12), " cannot be found in the navigation graph ", b0Var);
                return null;
            }
            int[] iArrE = zVarO.e(zVar);
            int length = iArrE.length;
            while (i11 < length) {
                arrayList2.add(Integer.valueOf(iArrE[i11]));
                arrayList3.add(bundle);
                i11++;
            }
            zVar = zVarO;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.FrameLayout, u10.g] */
    public void n(Canvas canvas) {
        Canvas canvas2;
        Paint paint = (Paint) this.f3501c;
        FrameLayout frameLayout = (FrameLayout) this.f3500b;
        u10.f fVar = (u10.f) this.f3502d;
        boolean z11 = fVar == null || fVar.f40634c == Float.MAX_VALUE;
        ?? r22 = (FrameLayout) this.f3499a;
        if (z11) {
            canvas2 = canvas;
            r22.c(canvas2);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2.drawRect(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), paint);
            }
        } else {
            r22.c(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        }
        Drawable drawable = (Drawable) this.f3503e;
        if (drawable == null || ((u10.f) this.f3502d) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float fWidth = ((u10.f) this.f3502d).f40632a - (bounds.width() / 2.0f);
        float fHeight = ((u10.f) this.f3502d).f40633b - (bounds.height() / 2.0f);
        canvas2.translate(fWidth, fHeight);
        ((Drawable) this.f3503e).draw(canvas2);
        canvas2.translate(-fWidth, -fHeight);
    }

    public g9.z o(int i11) {
        kotlin.collections.t tVar = new kotlin.collections.t();
        g9.b0 b0Var = (g9.b0) this.f3502d;
        b0Var.getClass();
        tVar.addLast(b0Var);
        while (!tVar.isEmpty()) {
            g9.z zVar = (g9.z) tVar.removeFirst();
            if (zVar.f20258b.f27563e == i11) {
                return zVar;
            }
            if (zVar instanceof g9.b0) {
                Iterator it = ((g9.b0) zVar).iterator();
                while (true) {
                    l9.i iVar = (l9.i) it;
                    if (iVar.hasNext()) {
                        tVar.addLast((g9.z) iVar.next());
                    }
                }
            }
        }
        return null;
    }

    public void p() {
        w("GET", null);
    }

    public float q(int i11, boolean z11) {
        Layout layout = (Layout) this.f3499a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i11));
        if (i11 > lineEnd) {
            i11 = lineEnd;
        }
        return z11 ? layout.getPrimaryHorizontal(i11) : layout.getSecondaryHorizontal(i11);
    }

    public float r(int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int iV = i11;
        Layout layout = (Layout) this.f3499a;
        if (!z12) {
            return q(i11, z11);
        }
        int iP = cg.p(layout, iV, z12);
        int lineStart = layout.getLineStart(iP);
        int lineEnd = layout.getLineEnd(iP);
        if (iV != lineStart && iV != lineEnd) {
            return q(i11, z11);
        }
        if (iV == 0 || iV == layout.getText().length()) {
            return q(i11, z11);
        }
        int iS = s(iV, z12);
        boolean z13 = layout.getParagraphDirection(layout.getLineForOffset(t(iS))) == -1;
        int iV2 = v(lineEnd, lineStart);
        int iT = t(iS);
        int i14 = lineStart - iT;
        int i15 = iV2 - iT;
        Bidi bidiF = f(iS);
        Bidi bidiCreateLineBidi = bidiF != null ? bidiF.createLineBidi(i14, i15) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z11 || z13 == zIsRtlCharAt) {
                z13 = !z13;
            }
            return iV == lineStart ? z13 : !z13 ? layout.getLineLeft(iP) : layout.getLineRight(iP);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        n5.e[] eVarArr = new n5.e[runCount];
        for (int i16 = 0; i16 < runCount; i16++) {
            eVarArr[i16] = new n5.e(bidiCreateLineBidi.getRunStart(i16) + lineStart, bidiCreateLineBidi.getRunLimit(i16) + lineStart, bidiCreateLineBidi.getRunLevel(i16) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i17 = 0; i17 < runCount2; i17++) {
            bArr[i17] = (byte) bidiCreateLineBidi.getRunLevel(i17);
        }
        Bidi.reorderVisually(bArr, 0, eVarArr, 0, runCount);
        if (iV == lineStart) {
            int i18 = 0;
            while (true) {
                if (i18 >= runCount) {
                    i13 = -1;
                    break;
                }
                if (eVarArr[i18].f30512a == iV) {
                    i13 = i18;
                    break;
                }
                i18++;
            }
            boolean z14 = (z11 || z13 == eVarArr[i13].f30514c) ? !z13 : z13;
            return (i13 == 0 && z14) ? layout.getLineLeft(iP) : (i13 != runCount - 1 || z14) ? z14 ? layout.getPrimaryHorizontal(eVarArr[i13 - 1].f30512a) : layout.getPrimaryHorizontal(eVarArr[i13 + 1].f30512a) : layout.getLineRight(iP);
        }
        if (iV > iV2) {
            iV = v(iV, lineStart);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= runCount) {
                i12 = -1;
                break;
            }
            if (eVarArr[i19].f30513b == iV) {
                i12 = i19;
                break;
            }
            i19++;
        }
        boolean z15 = (z11 || z13 == eVarArr[i12].f30514c) ? z13 : !z13;
        return (i12 == 0 && z15) ? layout.getLineLeft(iP) : (i12 != runCount - 1 || z15) ? z15 ? layout.getPrimaryHorizontal(eVarArr[i12 - 1].f30513b) : layout.getPrimaryHorizontal(eVarArr[i12 + 1].f30513b) : layout.getLineRight(iP);
    }

    public int s(int i11, boolean z11) {
        ArrayList arrayList = (ArrayList) this.f3500b;
        int iE = kotlin.collections.d0.e(arrayList, Integer.valueOf(i11));
        int i12 = iE < 0 ? -(iE + 1) : iE + 1;
        if (z11 && i12 > 0) {
            int i13 = i12 - 1;
            if (i11 == ((Number) arrayList.get(i13)).intValue()) {
                return i13;
            }
        }
        return i12;
    }

    public int t(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f3500b).get(i11 - 1)).intValue();
    }

    public void u(String str, String str2) {
        str2.getClass();
        ax.g0 g0Var = (ax.g0) this.f3501c;
        g0Var.getClass();
        zz.f.u(str);
        zz.f.v(str2, str);
        g0Var.i(str);
        zz.f.k(g0Var, str, str2);
    }

    public int v(int i11, int i12) {
        while (i11 > i12) {
            char cCharAt = ((Layout) this.f3499a).getText().charAt(i11 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((Intrinsics.compare((int) cCharAt, 8192) < 0 || Intrinsics.compare((int) cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i11;
            }
            i11--;
        }
        return i11;
    }

    public void w(String str, q90.n0 n0Var) {
        str.getClass();
        if (str.length() <= 0) {
            i4.a.f("method.isEmpty() == true");
            return;
        }
        if (n0Var == null) {
            if (Intrinsics.areEqual(str, "POST") || Intrinsics.areEqual(str, "PUT") || Intrinsics.areEqual(str, "PATCH") || Intrinsics.areEqual(str, "PROPPATCH") || Intrinsics.areEqual(str, "QUERY") || Intrinsics.areEqual(str, "REPORT")) {
                i4.a.i(w.a0.p("method ", str, " must have a request body."));
                return;
            }
        } else if (!dx.f.w(str)) {
            i4.a.i(w.a0.p("method ", str, " must not have a request body."));
            return;
        }
        this.f3500b = str;
        this.f3502d = n0Var;
    }

    public void x(Throwable th2) {
        kotlin.collections.t tVar = (kotlin.collections.t) this.f3503e;
        x80.i iVar = (x80.i) this.f3502d;
        if (iVar.n(th2, false)) {
            for (Object objD = iVar.d(); !(objD instanceof x80.o); objD = iVar.d()) {
                x80.p.b(objD);
                tVar.addLast(objD);
            }
            if (tVar.isEmpty()) {
                return;
            }
            ((Function1) this.f3499a).invoke(new ArrayList(tVar));
            tVar.clear();
        }
    }

    public void y(ty.a aVar, ty.g gVar) {
        wy.p pVar = (wy.p) this.f3503e;
        wy.i iVar = (wy.i) this.f3499a;
        String str = (String) this.f3500b;
        ty.e eVar = (ty.e) this.f3502d;
        if (eVar == null) {
            c50.w.l("Null transformer");
            return;
        }
        ty.c cVar = (ty.c) this.f3501c;
        bz.a aVar2 = pVar.f43591c;
        wy.i iVarB = iVar.b(aVar.f40609b);
        te teVar = new te();
        teVar.f11899g = new HashMap();
        teVar.f11897e = Long.valueOf(pVar.f43589a.c());
        teVar.f11898f = Long.valueOf(pVar.f43590b.c());
        teVar.f11894b = str;
        teVar.f11896d = new wy.k(cVar, (byte[]) eVar.apply(aVar.f40608a));
        teVar.f11895c = null;
        ty.b bVar = aVar.f40610c;
        if (bVar != null) {
            teVar.f11900h = bVar.f40611a;
        }
        aVar2.f6769b.execute(new b0.g(2, aVar2, iVarB, gVar, teVar.e()));
    }

    public void z(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.f3499a).put(str, obj);
        y80.f1 f1Var = (y80.f1) ((LinkedHashMap) this.f3501c).get(str);
        if (f1Var != null) {
            ((a2) f1Var).j(obj);
        }
        y80.f1 f1Var2 = (y80.f1) ((LinkedHashMap) this.f3502d).get(str);
        if (f1Var2 != null) {
            ((a2) f1Var2).j(obj);
        }
    }

    public n1(Order order) {
        order.getClass();
        a2 a2VarC = y80.r.c(0L);
        this.f3500b = a2VarC;
        this.f3501c = new y80.h1(a2VarC);
        a2 a2VarC2 = y80.r.c(Boolean.FALSE);
        this.f3502d = a2VarC2;
        this.f3503e = new y80.h1(a2VarC2);
        PickupInterval pickupInterval = order.getPickupInterval();
        long jH = mv.p0.h(pickupInterval != null ? pickupInterval.getIntervalStart() : null);
        PickupInterval redeemInterval = order.getRedeemInterval();
        long jH2 = jH - mv.p0.h(redeemInterval != null ? redeemInterval.getIntervalStart() : null);
        PickupInterval pickupInterval2 = order.getPickupInterval();
        long jH3 = mv.p0.h(pickupInterval2 != null ? pickupInterval2.getIntervalStart() : null) - System.currentTimeMillis();
        if (order.getState() == OrderState.ACTIVE || order.getState() == OrderState.COLLECTION_OFFERED || order.getState() == OrderState.COLLECTION_DELEGATED) {
            b2 b2Var = (b2) this.f3499a;
            if (b2Var != null) {
                b2Var.a(null);
            }
            this.f3499a = v80.f0.B(v80.c1.f42075a, null, null, new mv.l0(jH3, jH2, this, null), 3);
        }
    }

    public n1(Map map) {
        map.getClass();
        this.f3499a = new LinkedHashMap(map);
        this.f3500b = new LinkedHashMap();
        this.f3501c = new LinkedHashMap();
        this.f3502d = new LinkedHashMap();
        this.f3503e = new androidx.activity.g(this, 4);
    }

    public n1(KClass kClass, Function0 function0, Function0 function02, Function0 function03) {
        kClass.getClass();
        this.f3499a = kClass;
        this.f3500b = function0;
        this.f3501c = function02;
        this.f3502d = function03;
    }

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f3499a = obj;
        this.f3500b = obj2;
        this.f3501c = obj3;
        this.f3502d = obj4;
        this.f3503e = obj5;
    }

    public n1(g9.p pVar) {
        Intent launchIntentForPackage;
        Context context = pVar.f20185a;
        context.getClass();
        this.f3499a = context;
        this.f3500b = new ky.b(context, (short) 0);
        Activity activity = (Activity) o80.r.j(o80.r.n(o80.o.d(context, new g2.q(26)), new g2.q(27)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f3501c = launchIntentForPackage;
        this.f3503e = new ArrayList();
        this.f3502d = pVar.f20186b.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1(u10.g gVar) {
        this.f3499a = (FrameLayout) gVar;
        View view = (View) gVar;
        this.f3500b = (FrameLayout) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f3501c = paint;
        paint.setColor(0);
    }

    public n1() {
        this.f3503e = r90.a.f37804c;
        this.f3500b = "GET";
        this.f3501c = new ax.g0(3);
    }
}
