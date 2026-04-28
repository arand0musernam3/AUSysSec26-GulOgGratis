package com.app.tgtg.feature.locationpicker.newlocationpicker;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.m1;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import c5.a;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.user.requests.OnboardingUserAddress;
import com.app.tgtg.model.remote.user.response.Address;
import com.braze.h2;
import d40.t1;
import ft.j;
import g3.v3;
import g3.w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import m3.f;
import m3.i;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import np.b;
import o30.e0;
import op.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tg.c;
import tm.d;
import v80.b0;
import v80.f0;
import y80.a2;
import yk.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class NewLocationPicker extends a {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f9029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f9030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function0 f9031k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLocationPicker(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9029i = "";
        this.f9030j = i.w(Boolean.FALSE);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        String strA;
        Object obj;
        Object fVar;
        tg.i iVar;
        String strS;
        Object next;
        Iterator it;
        Object next2;
        Object next3;
        s sVar = (s) nVar;
        sVar.c0(696921043);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            w6 w6VarF = v3.f(6, 2, null, sVar);
            Object objM = sVar.M();
            f fVar2 = m.f29332a;
            if (objM == fVar2) {
                objM = i.o(g.f26549a, sVar);
                sVar.k0(objM);
            }
            b0 b0Var = (b0) objM;
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            b bVar = (b) t1.K(Reflection.getOrCreateKotlinClass(b.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            s1 s1VarA2 = z8.a.a(sVar);
            if (s1VarA2 == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            tg.i iVar2 = (tg.i) t1.K(Reflection.getOrCreateKotlinClass(tg.i.class), s1VarA2, e0.r(s1VarA2, sVar), s1VarA2 instanceof p ? ((p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            s1 s1VarA3 = z8.a.a(sVar);
            if (s1VarA3 == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            h hVar = (h) t1.K(Reflection.getOrCreateKotlinClass(h.class), s1VarA3, e0.r(s1VarA3, sVar), s1VarA3 instanceof p ? ((p) s1VarA3).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            Context context = (Context) sVar.j(v0.f7390b);
            j jVar = hVar.f46131d;
            c cVar = hVar.f46128a;
            context.getClass();
            jl.b bVar2 = jl.b.SELECTED;
            String string = context.getString(R.string.onboarding_where_selected);
            string.getClass();
            jl.c cVar2 = new jl.c(bVar2, R.drawable.location_other, string, false, null, 488);
            jl.b bVar3 = jl.b.GPS;
            String string2 = context.getString(R.string.onboarding_where_current);
            string2.getClass();
            l lVar = null;
            jl.c cVar3 = new jl.c(bVar3, R.drawable.location_current, string2, true, lVar, 488);
            jl.b bVar4 = jl.b.HOME;
            String string3 = context.getString(R.string.onboarding_where_home);
            string3.getClass();
            int i13 = 504;
            boolean z11 = false;
            jl.c cVar4 = new jl.c(bVar4, R.drawable.location_home, string3, z11, lVar, i13);
            jl.b bVar5 = jl.b.WORK;
            String string4 = context.getString(R.string.onboarding_where_work);
            string4.getClass();
            jl.c cVar5 = new jl.c(bVar5, R.drawable.location_work, string4, z11, lVar, i13);
            jl.b bVar6 = jl.b.OTHER;
            String string5 = context.getString(R.string.onboarding_where_other);
            string5.getClass();
            ArrayList arrayListJ = d0.j(cVar2, cVar3, cVar4, cVar5, new jl.c(bVar6, R.drawable.ic_location, string5, z11, lVar, i13));
            yk.f fVar3 = hVar.f46129b;
            if (fVar3.f46127b.b()) {
                jl.b bVar7 = jl.b.STATIONS;
                String string6 = context.getString(R.string.station_picker_stations);
                string6.getClass();
                arrayListJ.add(new jl.c(bVar7, R.drawable.location_station, string6, false, ft.c.B(), 376));
            }
            cVar.getClass();
            a2 a2Var = cVar.f40149d;
            a2 a2Var2 = cVar.f40148c;
            a2Var2.getClass();
            a2Var2.k(null, arrayListJ);
            List<OnboardingUserAddress> userPointsOfInterests = hVar.f46130c.m().getUserPointsOfInterests();
            if (!fVar3.f46127b.b() || ft.c.t() != jl.b.STATIONS ? (userPointsOfInterests == null || userPointsOfInterests.isEmpty()) && Intrinsics.areEqual(ft.c.r(), AppConstants.LOCATION_PICKER_SELECTED_LOCATION) && (strA = ft.c.A()) != null && strA.length() != 0 : ft.c.B() == null) {
                f0.B(m1.d(hVar), null, null, new d(hVar, null, 26), 3);
            }
            if (userPointsOfInterests != null) {
                Iterator it2 = userPointsOfInterests.iterator();
                while (it2.hasNext()) {
                    OnboardingUserAddress onboardingUserAddress = (OnboardingUserAddress) it2.next();
                    Iterator it3 = ((Iterable) a2Var.getValue()).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            next2 = null;
                            break;
                        } else {
                            next2 = it3.next();
                            it = it2;
                            if (Intrinsics.areEqual(((jl.c) next2).f25299a.name(), onboardingUserAddress.getType())) {
                                break;
                            } else {
                                it2 = it;
                            }
                        }
                    }
                    jl.c cVar6 = (jl.c) next2;
                    if (cVar6 != null) {
                        Iterator it4 = jl.b.a().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it4.next();
                            Iterator it5 = it4;
                            if (Intrinsics.areEqual(((jl.b) next3).name(), onboardingUserAddress.getType())) {
                                break;
                            } else {
                                it4 = it5;
                            }
                        }
                        jl.b bVar8 = (jl.b) next3;
                        if (bVar8 != null) {
                            Address address = new Address(onboardingUserAddress.getAddress().getDisplayName(), onboardingUserAddress.getAddress().getCenter(), (String) null, 4, (DefaultConstructorMarker) null);
                            jVar.getClass();
                            cVar.e(jl.c.a(cVar6, bVar8, address, true, bVar8 == ft.c.t(), cVar6.f25305g, null, null, 390));
                        }
                    }
                    it2 = it;
                }
            }
            if (ft.c.t() == jl.b.SELECTED && (strS = ft.c.s()) != null && !StringsKt.H(strS)) {
                Iterator it6 = ((Iterable) a2Var.getValue()).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (((jl.c) next).f25299a == jl.b.SELECTED) {
                            break;
                        }
                    }
                }
                jl.c cVar7 = (jl.c) next;
                if (cVar7 != null) {
                    cVar.e(jl.c.a(cVar7, null, new Address(strS, ft.c.z(), (String) null, 4, (DefaultConstructorMarker) null), true, false, false, null, null, 487));
                }
            }
            jVar.getClass();
            jl.b bVarT = ft.c.t();
            Iterator it7 = ((Iterable) a2Var.getValue()).iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                Object next4 = it7.next();
                if (((jl.c) next4).f25299a == bVarT) {
                    obj = next4;
                    break;
                }
            }
            jl.c cVar8 = (jl.c) obj;
            if (cVar8 != null) {
                cVar.e(jl.c.a(cVar8, null, null, false, true, false, null, null, 479));
            }
            if (getShowSheet()) {
                sVar.a0(103398371);
                boolean zH = sVar.h(b0Var) | sVar.h(iVar2) | sVar.f(w6VarF) | sVar.h(this);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar2) {
                    iVar = iVar2;
                    fVar = new yi.f(1, b0Var, iVar, w6VarF, this);
                    sVar.k0(fVar);
                } else {
                    fVar = objM2;
                    iVar = iVar2;
                }
                na0.a.N(w6VarF, hVar, iVar, bVar, (Function0) fVar, this.f9031k, this.f9029i, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(104147951);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(this, i11, 27);
        }
    }

    @Nullable
    public final Function0<Unit> getOnApplyChangesClicked() {
        return this.f9031k;
    }

    @NotNull
    public final String getOpenedFrom() {
        return this.f9029i;
    }

    public final boolean getShowSheet() {
        return ((Boolean) this.f9030j.getValue()).booleanValue();
    }

    public final void setOnApplyChangesClicked(@Nullable Function0<Unit> function0) {
        this.f9031k = function0;
    }

    public final void setOpenedFrom(@NotNull String str) {
        str.getClass();
        this.f9029i = str;
    }

    public final void setShowSheet(boolean z11) {
        this.f9030j.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewLocationPicker(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewLocationPicker(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewLocationPicker(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
