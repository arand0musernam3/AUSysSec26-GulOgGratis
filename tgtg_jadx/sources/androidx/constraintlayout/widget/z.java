package androidx.constraintlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;
import org.xmlpull.v1.XmlPullParserException;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements o30.a0, AccessibilityViewCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2543c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public z(Context context, XmlResourceParser xmlResourceParser) {
        this.f2541a = 0;
        this.f2542b = -1;
        this.f2543c = new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f2526u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                this.f2542b = typedArrayObtainStyledAttributes.getResourceId(index, this.f2542b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            x xVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                xVar = new x(context, xmlResourceParser);
                                ((SparseArray) this.f2543c).put(xVar.f2533a, xVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                y yVar = new y(context, xmlResourceParser);
                                if (xVar != null) {
                                    xVar.f2534b.add(yVar);
                                }
                            }
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e5) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e5);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        }
    }

    public static z e() {
        z zVar = new z(9, (byte) 0);
        zVar.f2543c = p40.d.DEFAULT;
        return zVar;
    }

    public static void h(String str) {
        if (kotlin.text.y.k(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean z12 = Intrinsics.compare((int) str.charAt(!z11 ? i11 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                } else {
                    length--;
                }
            } else if (z12) {
                i11++;
            } else {
                z11 = true;
            }
        }
        if (str.subSequence(i11, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e5) {
            Log.w("SupportSQLite", "delete failed: ", e5);
        }
    }

    public void a(long j9) {
        if (f(j9)) {
            return;
        }
        int i11 = this.f2542b;
        long[] jArrCopyOf = (long[]) this.f2543c;
        if (i11 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i11 + 1, jArrCopyOf.length * 2));
            this.f2543c = jArrCopyOf;
        }
        jArrCopyOf[i11] = j9;
        if (i11 >= this.f2542b) {
            this.f2542b = i11 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(q1.h1 r12, z70.c r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f2543c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            boolean r1 = r13 instanceof uf.h
            if (r1 == 0) goto L17
            r1 = r13
            uf.h r1 = (uf.h) r1
            int r2 = r1.f41112n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f41112n = r2
            goto L1c
        L17:
            uf.h r1 = new uf.h
            r1.<init>(r11, r13)
        L1c:
            java.lang.Object r13 = r1.l
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f41112n
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2f
            q1.h1 r12 = r1.f41110k
            androidx.constraintlayout.widget.z r0 = r1.f41109j
            ba0.g.M(r13)
            goto L5f
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L36:
            ba0.g.M(r13)
            int r13 = r0.get()
            int r3 = r11.f2542b
            if (r13 >= r3) goto L6e
            r13 = 1000(0x3e8, float:1.401E-42)
            double r5 = (double) r13
            int r13 = r0.get()
            double r7 = (double) r13
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r9, r7)
            double r7 = r7 * r5
            long r5 = (long) r7
            r1.f41109j = r11
            r1.f41110k = r12
            r1.f41112n = r4
            java.lang.Object r13 = v80.f0.o(r5, r1)
            if (r13 != r2) goto L5e
            return r2
        L5e:
            r0 = r11
        L5f:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r12.invoke(r13)
            java.lang.Object r12 = r0.f2543c
            java.util.concurrent.atomic.AtomicInteger r12 = (java.util.concurrent.atomic.AtomicInteger) r12
            r12.incrementAndGet()
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        L6e:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r12.invoke(r13)
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.z.b(q1.h1, z70.c):java.lang.Object");
    }

    public p40.a c() {
        return new p40.a(this.f2542b, (p40.d) this.f2543c);
    }

    @Override // o30.a0
    public /* synthetic */ ListenableFuture call() {
        return ((q2) this.f2543c).v0(this.f2542b);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f2543c).J(this.f2542b);
        return true;
    }

    public boolean f(long j9) {
        int i11 = this.f2542b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (((long[]) this.f2543c)[i12] == j9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public k.f g() {
        k.c cVar = (k.c) this.f2543c;
        k.f fVar = new k.f(cVar.f25518a, this.f2542b);
        View view = cVar.f25522e;
        k.e eVar = fVar.f25563a;
        if (view != null) {
            eVar.f25554w = view;
        } else {
            CharSequence charSequence = cVar.f25521d;
            if (charSequence != null) {
                eVar.f25536d = charSequence;
                TextView textView = eVar.f25552u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f25520c;
            if (drawable != null) {
                eVar.f25550s = drawable;
                ImageView imageView = eVar.f25551t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f25551t.setImageDrawable(drawable);
                }
            }
        }
        String str = cVar.f25523f;
        if (str != null) {
            eVar.f25537e = str;
            TextView textView2 = eVar.f25553v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = cVar.f25524g;
        if (charSequence2 != null) {
            com.adyen.checkout.ui.core.internal.ui.view.e eVar2 = cVar.f25525h;
            Message messageObtainMessage = eVar2 != null ? eVar.E.obtainMessage(-1, eVar2) : null;
            eVar.f25542j = charSequence2;
            eVar.f25543k = messageObtainMessage;
        }
        if (cVar.f25528k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f25519b.inflate(eVar.A, (ViewGroup) null);
            int i11 = cVar.f25530n ? eVar.B : eVar.C;
            Object obj = cVar.f25528k;
            ?? dVar = obj;
            if (obj == null) {
                dVar = new k.d(cVar.f25518a, i11, R.id.text1, null);
            }
            eVar.f25555x = dVar;
            eVar.f25556y = cVar.f25531o;
            if (cVar.l != null) {
                alertController$RecycleListView.setOnItemClickListener(new k.b(0, cVar, eVar));
            }
            if (cVar.f25530n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f25538f = alertController$RecycleListView;
        }
        View view2 = cVar.f25529m;
        if (view2 != null) {
            eVar.f25539g = view2;
            eVar.f25540h = false;
        }
        fVar.setCancelable(cVar.f25526i);
        if (cVar.f25526i) {
            fVar.setCanceledOnTouchOutside(true);
        }
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        o.m mVar = cVar.f25527j;
        if (mVar != null) {
            fVar.setOnKeyListener(mVar);
        }
        return fVar;
    }

    public void i(int i11, int i12) {
        int i13 = i12 + i11;
        char[] cArr = (char[]) this.f2543c;
        if (cArr.length <= i13) {
            int i14 = i11 * 2;
            if (i13 < i14) {
                i13 = i14;
            }
            this.f2543c = Arrays.copyOf(cArr, i13);
        }
    }

    public boolean j() {
        return ((ve.a) this.f2543c) != null;
    }

    public void k(int i11, ia0.d dVar) {
        while (true) {
            int i12 = i11 >> 1;
            if (i12 == 0) {
                break;
            }
            ia0.d dVar2 = ((ia0.d[]) this.f2543c)[i12];
            dVar2.getClass();
            if (Intrinsics.compare(0L, dVar.f23621g - dVar2.f23621g) <= 0) {
                break;
            }
            dVar2.f23620f = i11;
            ((ia0.d[]) this.f2543c)[i11] = dVar2;
            i11 = i12;
        }
        ((ia0.d[]) this.f2543c)[i11] = dVar;
        dVar.f23620f = i11;
    }

    public void l(ja.b bVar, int i11, int i12) {
        ((a40.x) this.f2543c).m(new ka.a(bVar), i11, i12);
    }

    public void m() {
        o90.d dVar = o90.d.f32161c;
        char[] cArr = (char[]) this.f2543c;
        dVar.getClass();
        cArr.getClass();
        synchronized (dVar) {
            int i11 = dVar.f32163b;
            if (cArr.length + i11 < o90.c.f32160a) {
                dVar.f32163b = i11 + cArr.length;
                dVar.f32162a.addLast(cArr);
            }
        }
    }

    public void n(long j9) {
        int i11 = this.f2542b;
        int i12 = 0;
        while (i12 < i11) {
            if (j9 == ((long[]) this.f2543c)[i12]) {
                int i13 = this.f2542b - 1;
                while (i12 < i13) {
                    long[] jArr = (long[]) this.f2543c;
                    int i14 = i12 + 1;
                    jArr[i12] = jArr[i14];
                    i12 = i14;
                }
                this.f2542b--;
                return;
            }
            i12++;
        }
    }

    public void o(ia0.d dVar) {
        ia0.d dVar2;
        int i11 = dVar.f23620f;
        if (i11 == -1) {
            i4.a.f("Failed requirement.");
            return;
        }
        int i12 = this.f2542b;
        ia0.d dVar3 = ((ia0.d[]) this.f2543c)[i12];
        dVar3.getClass();
        dVar.f23620f = -1;
        ((ia0.d[]) this.f2543c)[i12] = null;
        this.f2542b = i12 - 1;
        if (dVar == dVar3) {
            return;
        }
        int iCompare = Intrinsics.compare(0L, dVar3.f23621g - dVar.f23621g);
        if (iCompare == 0) {
            ((ia0.d[]) this.f2543c)[i11] = dVar3;
            dVar3.f23620f = i11;
            return;
        }
        if (iCompare >= 0) {
            k(i11, dVar3);
            return;
        }
        while (true) {
            int i13 = i11 << 1;
            int i14 = i13 + 1;
            int i15 = this.f2542b;
            if (i14 > i15) {
                if (i13 > i15) {
                    break;
                }
                dVar2 = ((ia0.d[]) this.f2543c)[i13];
                dVar2.getClass();
            } else {
                dVar2 = ((ia0.d[]) this.f2543c)[i13];
                dVar2.getClass();
                ia0.d dVar4 = ((ia0.d[]) this.f2543c)[i14];
                dVar4.getClass();
                if (Intrinsics.compare(0L, dVar4.f23621g - dVar2.f23621g) >= 0) {
                    dVar2 = dVar4;
                }
            }
            if (Intrinsics.compare(0L, dVar2.f23621g - dVar3.f23621g) <= 0) {
                break;
            }
            int i16 = dVar2.f23620f;
            dVar2.f23620f = i11;
            ((ia0.d[]) this.f2543c)[i11] = dVar2;
            i11 = i16;
        }
        ((ia0.d[]) this.f2543c)[i11] = dVar3;
        dVar3.f23620f = i11;
    }

    public int p(int i11) {
        float f11 = -1;
        SparseArray sparseArray = (SparseArray) this.f2543c;
        int i12 = 0;
        if (-1 == i11) {
            x xVar = i11 == -1 ? (x) sparseArray.valueAt(0) : (x) sparseArray.get(-1);
            if (xVar != null) {
                ArrayList arrayList = xVar.f2534b;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((y) arrayList.get(i12)).a(f11, f11)) {
                        break;
                    }
                    i12++;
                }
                if (-1 != i12) {
                    return i12 == -1 ? xVar.f2535c : ((y) arrayList.get(i12)).f2540e;
                }
            }
        } else {
            x xVar2 = (x) sparseArray.get(i11);
            if (xVar2 != null) {
                ArrayList arrayList2 = xVar2.f2534b;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((y) arrayList2.get(i12)).a(f11, f11)) {
                        break;
                    }
                    i12++;
                }
                return i12 == -1 ? xVar2.f2535c : ((y) arrayList2.get(i12)).f2540e;
            }
        }
        return -1;
    }

    public void q(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        i(this.f2542b, length);
        str.getChars(0, str.length(), (char[]) this.f2543c, this.f2542b);
        this.f2542b += length;
    }

    public String toString() {
        switch (this.f2541a) {
            case 8:
                return new String((char[]) this.f2543c, 0, this.f2542b);
            default:
                return super.toString();
        }
    }

    public z(int i11, e0.q qVar) {
        this.f2541a = 4;
        qVar.getClass();
        this.f2542b = i11;
        this.f2543c = qVar;
    }

    public /* synthetic */ z(int i11, Serializable serializable, int i12) {
        this.f2541a = i12;
        this.f2542b = i11;
        this.f2543c = serializable;
    }

    public /* synthetic */ z(Object obj, int i11, int i12) {
        this.f2541a = i12;
        this.f2543c = obj;
        this.f2542b = i11;
    }

    public z(int i11, int i12) {
        this.f2541a = i12;
        switch (i12) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f2542b = i11;
                break;
            default:
                this.f2542b = i11;
                this.f2543c = new AtomicInteger(0);
                break;
        }
    }

    public z() {
        this.f2541a = 12;
        this.f2542b = 255;
        this.f2543c = null;
    }

    public /* synthetic */ z(int i11, byte b8) {
        this.f2541a = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(a40.x xVar, int i11) {
        this(i11, 15);
        this.f2541a = 15;
        this.f2543c = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        this(context, k.f.c(context, 0));
        this.f2541a = 7;
    }

    public z(Context context, int i11) {
        this.f2541a = 7;
        this.f2543c = new k.c(new ContextThemeWrapper(context, k.f.c(context, i11)));
        this.f2542b = i11;
    }
}
