package c40;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.appcompat.widget.ActionMenuView;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import androidx.constraintlayout.widget.z;
import e20.k0;
import h7.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import m0.s;
import o.w;
import o90.a0;
import s0.p0;
import s0.q0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class i implements l, k0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7070b;

    public i(Context context, s sVar) {
        context.getClass();
        boolean z11 = false;
        this.f7069a = Build.VERSION.SDK_INT >= 34 && i0.l(context) != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numB = sVar != null ? sVar.b() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z12 = zHasSystemFeature && (numB == null || numB.intValue() == 1);
        if (zHasSystemFeature2 && (numB == null || numB.intValue() == 0)) {
            z11 = true;
        }
        this.f7070b = new q0(z12, z11);
    }

    public static boolean c(Set set, s sVar) {
        try {
            sVar.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // c40.l
    public void a(k kVar, int i11) {
        StringBuilder sb2 = (StringBuilder) this.f7070b;
        if (this.f7069a) {
            this.f7069a = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i11);
    }

    public boolean b() {
        return this.f7069a;
    }

    public boolean d(LinkedHashSet linkedHashSet, Set set) {
        q0 q0Var = (q0) this.f7070b;
        set.getClass();
        if (!this.f7069a) {
            boolean z11 = q0Var.f38433a;
            boolean z12 = q0Var.f38434b;
            if (z11 || z12) {
                s sVar = s.f28588c;
                sVar.getClass();
                boolean zC = c(linkedHashSet, sVar);
                s sVar2 = s.f28587b;
                sVar2.getClass();
                boolean zC2 = c(linkedHashSet, sVar2);
                Set set2 = set;
                ArrayList arrayList = new ArrayList(e0.o(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((m0.p) it.next()).a());
                }
                Set setV0 = CollectionsKt.v0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (!setV0.contains(((s0.i0) obj).q().d())) {
                        arrayList2.add(obj);
                    }
                }
                Set setV02 = CollectionsKt.v0(arrayList2);
                s sVar3 = s.f28588c;
                sVar3.getClass();
                boolean zC3 = c(setV02, sVar3);
                s sVar4 = s.f28587b;
                sVar4.getClass();
                boolean zC4 = c(setV02, sVar4);
                boolean z13 = q0Var.f38433a && zC && !zC3;
                boolean z14 = z12 && zC2 && !zC4;
                if (z13 || z14) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    @Override // e20.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.view.WindowInsetsCompat e(android.view.View r12, androidx.core.view.WindowInsetsCompat r13, e20.l0 r14) {
        /*
            r11 = this;
            int r0 = h7.h2.h()
            x6.d r0 = r13.e(r0)
            int r1 = h7.h2.e()
            x6.d r1 = r13.e(r1)
            java.lang.Object r2 = r11.f7070b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            boolean r3 = r2.f12332o
            int r4 = r0.f43874b
            r2.f12340w = r4
            int r4 = r12.getLayoutDirection()
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L24
            r4 = r6
            goto L25
        L24:
            r4 = r5
        L25:
            int r7 = r12.getPaddingBottom()
            int r8 = r12.getPaddingLeft()
            int r9 = r12.getPaddingRight()
            if (r3 == 0) goto L3c
            int r7 = r13.i()
            r2.f12339v = r7
            int r10 = r14.f15683d
            int r7 = r7 + r10
        L3c:
            boolean r10 = r2.f12333p
            if (r10 == 0) goto L4a
            if (r4 == 0) goto L45
            int r8 = r14.f15682c
            goto L47
        L45:
            int r8 = r14.f15680a
        L47:
            int r10 = r0.f43873a
            int r8 = r8 + r10
        L4a:
            boolean r10 = r2.f12334q
            if (r10 == 0) goto L59
            if (r4 == 0) goto L53
            int r14 = r14.f15680a
            goto L55
        L53:
            int r14 = r14.f15682c
        L55:
            int r4 = r0.f43875c
            int r9 = r14 + r4
        L59:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            boolean r4 = r2.f12336s
            if (r4 == 0) goto L6c
            int r4 = r14.leftMargin
            int r10 = r0.f43873a
            if (r4 == r10) goto L6c
            r14.leftMargin = r10
            r5 = r6
        L6c:
            boolean r4 = r2.f12337t
            if (r4 == 0) goto L79
            int r4 = r14.rightMargin
            int r10 = r0.f43875c
            if (r4 == r10) goto L79
            r14.rightMargin = r10
            r5 = r6
        L79:
            boolean r4 = r2.f12338u
            if (r4 == 0) goto L86
            int r4 = r14.topMargin
            int r0 = r0.f43874b
            if (r4 == r0) goto L86
            r14.topMargin = r0
            goto L87
        L86:
            r6 = r5
        L87:
            if (r6 == 0) goto L8c
            r12.setLayoutParams(r14)
        L8c:
            int r14 = r12.getPaddingTop()
            r12.setPadding(r8, r14, r9, r7)
            boolean r12 = r11.f7069a
            if (r12 == 0) goto L9b
            int r14 = r1.f43876d
            r2.f12329m = r14
        L9b:
            if (r3 != 0) goto La1
            if (r12 == 0) goto La0
            goto La1
        La0:
            return r13
        La1:
            r2.Q()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.i.e(android.view.View, androidx.core.view.WindowInsetsCompat, e20.l0):androidx.core.view.WindowInsetsCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L48
            if (r7 < 0) goto L48
            int r1 = r8.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L48
            java.lang.Object r1 = r6.f7070b
            f7.e r1 = (f7.e) r1
            if (r1 != 0) goto L17
            boolean r7 = r6.b()
            return r7
        L17:
            r1.getClass()
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r7) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            c40.i r5 = f7.f.f17465a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.b()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            i4.a.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.i.f(int, java.lang.CharSequence):boolean");
    }

    public void g() {
        this.f7069a = false;
    }

    @Override // o.w
    public void h(o.l lVar, boolean z11) {
        androidx.appcompat.widget.a aVar;
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) this.f7070b;
        if (this.f7069a) {
            return;
        }
        this.f7069a = true;
        ActionMenuView actionMenuView = bVar.f1805a.f2157a.f2098a;
        if (actionMenuView != null && (aVar = actionMenuView.f1990t) != null) {
            aVar.g();
            p.d dVar = aVar.f2138u;
            if (dVar != null && dVar.b()) {
                dVar.f31614i.dismiss();
            }
        }
        bVar.f1806b.onPanelClosed(108, lVar);
        this.f7069a = false;
    }

    public void i(byte b8) {
        ((z) this.f7070b).q(String.valueOf(b8));
    }

    public void j(char c3) {
        z zVar = (z) this.f7070b;
        zVar.i(zVar.f2542b, 1);
        char[] cArr = (char[]) zVar.f2543c;
        int i11 = zVar.f2542b;
        zVar.f2542b = i11 + 1;
        cArr[i11] = c3;
    }

    public void k(int i11) {
        ((z) this.f7070b).q(String.valueOf(i11));
    }

    public void l(long j9) {
        ((z) this.f7070b).q(String.valueOf(j9));
    }

    public void m(String str) {
        str.getClass();
        ((z) this.f7070b).q(str);
    }

    public void n(short s7) {
        ((z) this.f7070b).q(String.valueOf(s7));
    }

    public void o(String str) {
        byte b8;
        str.getClass();
        z zVar = (z) this.f7070b;
        zVar.i(zVar.f2542b, str.length() + 2);
        char[] cArr = (char[]) zVar.f2543c;
        int i11 = zVar.f2542b;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        int i14 = i12;
        while (i14 < i13) {
            char c3 = cArr[i14];
            byte[] bArr = a0.f32155b;
            if (c3 < bArr.length && bArr[c3] != 0) {
                int length2 = str.length();
                for (int i15 = i14 - i12; i15 < length2; i15++) {
                    zVar.i(i14, 2);
                    char cCharAt = str.charAt(i15);
                    byte[] bArr2 = a0.f32155b;
                    if (cCharAt >= bArr2.length || (b8 = bArr2[cCharAt]) == 0) {
                        int i16 = i14 + 1;
                        ((char[]) zVar.f2543c)[i14] = cCharAt;
                        i14 = i16;
                    } else {
                        if (b8 == 1) {
                            String str2 = a0.f32154a[cCharAt];
                            str2.getClass();
                            zVar.i(i14, str2.length());
                            str2.getChars(0, str2.length(), (char[]) zVar.f2543c, i14);
                            int length3 = str2.length() + i14;
                            zVar.f2542b = length3;
                            i14 = length3;
                        } else {
                            char[] cArr2 = (char[]) zVar.f2543c;
                            cArr2[i14] = '\\';
                            cArr2[i14 + 1] = (char) b8;
                            i14 += 2;
                            zVar.f2542b = i14;
                        }
                    }
                }
                zVar.i(i14, 1);
                ((char[]) zVar.f2543c)[i14] = '\"';
                zVar.f2542b = i14 + 1;
                return;
            }
            i14++;
        }
        cArr[i13] = '\"';
        zVar.f2542b = i13 + 1;
    }

    public void r(p0 p0Var) throws CameraValidator$CameraIdListIncorrectException {
        q0 q0Var = (q0) this.f7070b;
        p0Var.getClass();
        if (this.f7069a) {
            wd.a.p("CameraValidator", "Virtual device with " + p0Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        wd.a.p("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (q0Var.f38433a) {
            try {
                s.f28588c.c(p0Var.c()).getClass();
                e = null;
            } catch (RuntimeException e5) {
                e = e5;
                wd.a.J("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        } else {
            e = null;
        }
        if (q0Var.f38434b) {
            try {
                s.f28587b.c(p0Var.c()).getClass();
            } catch (RuntimeException e11) {
                wd.a.J("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e11);
                if (e == null) {
                    e = e11;
                }
            }
        }
        if (e != null) {
            throw new CameraValidator$CameraIdListIncorrectException(p0Var.c().size(), e);
        }
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        ((androidx.appcompat.app.b) this.f7070b).f1806b.onMenuOpened(108, lVar);
        return true;
    }

    public void p() {
    }

    public void q() {
    }

    public /* synthetic */ i(Object obj, byte b8) {
        this.f7070b = obj;
    }

    public /* synthetic */ i(Object obj, boolean z11) {
        this.f7070b = obj;
        this.f7069a = z11;
    }

    public /* synthetic */ i(Object obj) {
        this.f7070b = obj;
        this.f7069a = true;
    }

    public i(f7.e eVar, boolean z11) {
        this((Object) eVar, (byte) 0);
        this.f7069a = z11;
    }
}
