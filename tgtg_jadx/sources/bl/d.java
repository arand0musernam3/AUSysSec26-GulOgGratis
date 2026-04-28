package bl;

import a3.f3;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.e0;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.y;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b5.r1;
import bg.n0;
import com.app.tgtg.R;
import cv.i;
import ft.q;
import ft.s;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o00.x0;
import ox.h;
import p70.g;
import p70.k;
import pg.a0;
import pg.z;
import u70.j;
import u70.l;
import u70.m;
import v80.f0;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl/d;", "Landroidx/fragment/app/y;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCookiesDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookiesDialogFragment.kt\ncom/app/tgtg/feature/login/cookies/CookiesDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,231:1\n106#2,15:232\n27#3:247\n*S KotlinDebug\n*F\n+ 1 CookiesDialogFragment.kt\ncom/app/tgtg/feature/login/cookies/CookiesDialogFragment\n*L\n33#1:232,15\n64#1:247\n*E\n"})
public final class d extends y implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f6336a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f6338c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f6341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f6342g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6337b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6339d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6340e = false;

    public d() {
        j jVarA = l.a(m.NONE, new defpackage.a(new defpackage.a(this, 3), 4));
        this.f6341f = new n1(Reflection.getOrCreateKotlinClass(gr.k.class), new c(jVarA, 0), new r1(1, this, jVarA), new c(jVarA, 1));
    }

    @Override // r70.b
    public final Object a() {
        if (this.f6338c == null) {
            synchronized (this.f6339d) {
                try {
                    if (this.f6338c == null) {
                        this.f6338c = new g(this);
                    }
                } finally {
                }
            }
        }
        return this.f6338c.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f6337b) {
            return null;
        }
        q();
        return this.f6336a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        k kVar = this.f6336a;
        h.q(kVar == null || g.d(kVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q();
        if (this.f6340e) {
            return;
        }
        this.f6340e = true;
        ((e) a()).getClass();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().b(new e0(this, 2), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i11 = z.B;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        z zVar = (z) a8.k.Z(layoutInflater, R.layout.cookies_dialog_fragment, viewGroup, false, null);
        this.f6342g = zVar;
        zVar.getClass();
        View view = zVar.f986f;
        view.getClass();
        return view;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new k(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        x0.l(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        z zVar = this.f6342g;
        zVar.getClass();
        final int i11 = 0;
        zVar.f35295u.setOnClickListener(new View.OnClickListener(this) { // from class: bl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6333b;

            {
                this.f6333b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r8v9, types: [cv.b] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i12 = i11;
                int i13 = 2;
                d dVar = this.f6333b;
                switch (i12) {
                    case 0:
                        dVar.p().c(false);
                        s sVar = dVar.p().f20821d;
                        sVar.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar, A, i13));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP = dVar.p();
                        i iVar = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar = dv.a.OPT_IN;
                        dv.d dVar2 = dv.d.DISMISSED;
                        A = dVar2 != null ? dVar2.a() : 0;
                        iVar.getClass();
                        aVar.getClass();
                        kVarP.f20820c.d(iVar, aVar, A);
                        dVar.dismiss();
                        break;
                    case 1:
                        pj.b bVar = new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("Details", bVar);
                        a aVar2 = new a();
                        aVar2.setArguments(bundle2);
                        aVar2.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 2:
                        pj.b bVar2 = new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q()));
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("Details", bVar2);
                        a aVar3 = new a();
                        aVar3.setArguments(bundle3);
                        aVar3.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 3:
                        s sVar2 = dVar.p().f20821d;
                        sVar2.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar2, A, i13));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP2 = dVar.p();
                        i iVar2 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar4 = dv.a.OPT_IN;
                        dv.d dVar3 = dv.d.NECESSARY;
                        String strA = dVar3 != null ? dVar3.a() : null;
                        iVar2.getClass();
                        aVar4.getClass();
                        kVarP2.f20820c.d(iVar2, aVar4, strA);
                        dVar.r();
                        break;
                    default:
                        gr.k kVarP3 = dVar.p();
                        s sVar3 = kVarP3.f20821d;
                        sVar3.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar3, A, i13));
                        f0.E(kotlin.coroutines.g.f26549a, new f3(sVar3, true, A, 4));
                        kVarP3.f20825h.k(Boolean.TRUE);
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP4 = dVar.p();
                        i iVar3 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar5 = dv.a.OPT_IN;
                        dv.d dVar4 = dv.d.EVERYTHING;
                        String strA2 = dVar4 != null ? dVar4.a() : null;
                        iVar3.getClass();
                        aVar5.getClass();
                        kVarP4.f20820c.d(iVar3, aVar5, strA2);
                        dVar.r();
                        break;
                }
            }
        });
        final int i12 = 1;
        zVar.f35296v.setOnClickListener(new n0(i12, this, zVar));
        zVar.f35299y.setOnClickListener(new View.OnClickListener(this) { // from class: bl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6333b;

            {
                this.f6333b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r8v9, types: [cv.b] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i122 = i12;
                int i13 = 2;
                d dVar = this.f6333b;
                switch (i122) {
                    case 0:
                        dVar.p().c(false);
                        s sVar = dVar.p().f20821d;
                        sVar.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar, A, i13));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP = dVar.p();
                        i iVar = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar = dv.a.OPT_IN;
                        dv.d dVar2 = dv.d.DISMISSED;
                        A = dVar2 != null ? dVar2.a() : 0;
                        iVar.getClass();
                        aVar.getClass();
                        kVarP.f20820c.d(iVar, aVar, A);
                        dVar.dismiss();
                        break;
                    case 1:
                        pj.b bVar = new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("Details", bVar);
                        a aVar2 = new a();
                        aVar2.setArguments(bundle2);
                        aVar2.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 2:
                        pj.b bVar2 = new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q()));
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("Details", bVar2);
                        a aVar3 = new a();
                        aVar3.setArguments(bundle3);
                        aVar3.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 3:
                        s sVar2 = dVar.p().f20821d;
                        sVar2.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar2, A, i13));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP2 = dVar.p();
                        i iVar2 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar4 = dv.a.OPT_IN;
                        dv.d dVar3 = dv.d.NECESSARY;
                        String strA = dVar3 != null ? dVar3.a() : null;
                        iVar2.getClass();
                        aVar4.getClass();
                        kVarP2.f20820c.d(iVar2, aVar4, strA);
                        dVar.r();
                        break;
                    default:
                        gr.k kVarP3 = dVar.p();
                        s sVar3 = kVarP3.f20821d;
                        sVar3.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar3, A, i13));
                        f0.E(kotlin.coroutines.g.f26549a, new f3(sVar3, true, A, 4));
                        kVarP3.f20825h.k(Boolean.TRUE);
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP4 = dVar.p();
                        i iVar3 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar5 = dv.a.OPT_IN;
                        dv.d dVar4 = dv.d.EVERYTHING;
                        String strA2 = dVar4 != null ? dVar4.a() : null;
                        iVar3.getClass();
                        aVar5.getClass();
                        kVarP4.f20820c.d(iVar3, aVar5, strA2);
                        dVar.r();
                        break;
                }
            }
        });
        final int i13 = 2;
        zVar.f35297w.setOnClickListener(new View.OnClickListener(this) { // from class: bl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6333b;

            {
                this.f6333b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r8v9, types: [cv.b] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i122 = i13;
                int i132 = 2;
                d dVar = this.f6333b;
                switch (i122) {
                    case 0:
                        dVar.p().c(false);
                        s sVar = dVar.p().f20821d;
                        sVar.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar, A, i132));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP = dVar.p();
                        i iVar = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar = dv.a.OPT_IN;
                        dv.d dVar2 = dv.d.DISMISSED;
                        A = dVar2 != null ? dVar2.a() : 0;
                        iVar.getClass();
                        aVar.getClass();
                        kVarP.f20820c.d(iVar, aVar, A);
                        dVar.dismiss();
                        break;
                    case 1:
                        pj.b bVar = new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("Details", bVar);
                        a aVar2 = new a();
                        aVar2.setArguments(bundle2);
                        aVar2.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 2:
                        pj.b bVar2 = new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q()));
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("Details", bVar2);
                        a aVar3 = new a();
                        aVar3.setArguments(bundle3);
                        aVar3.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 3:
                        s sVar2 = dVar.p().f20821d;
                        sVar2.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar2, A, i132));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP2 = dVar.p();
                        i iVar2 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar4 = dv.a.OPT_IN;
                        dv.d dVar3 = dv.d.NECESSARY;
                        String strA = dVar3 != null ? dVar3.a() : null;
                        iVar2.getClass();
                        aVar4.getClass();
                        kVarP2.f20820c.d(iVar2, aVar4, strA);
                        dVar.r();
                        break;
                    default:
                        gr.k kVarP3 = dVar.p();
                        s sVar3 = kVarP3.f20821d;
                        sVar3.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar3, A, i132));
                        f0.E(kotlin.coroutines.g.f26549a, new f3(sVar3, true, A, 4));
                        kVarP3.f20825h.k(Boolean.TRUE);
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP4 = dVar.p();
                        i iVar3 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar5 = dv.a.OPT_IN;
                        dv.d dVar4 = dv.d.EVERYTHING;
                        String strA2 = dVar4 != null ? dVar4.a() : null;
                        iVar3.getClass();
                        aVar5.getClass();
                        kVarP4.f20820c.d(iVar3, aVar5, strA2);
                        dVar.r();
                        break;
                }
            }
        });
        final int i14 = 3;
        zVar.f35294t.setOnClickListener(new View.OnClickListener(this) { // from class: bl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6333b;

            {
                this.f6333b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r8v9, types: [cv.b] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i122 = i14;
                int i132 = 2;
                d dVar = this.f6333b;
                switch (i122) {
                    case 0:
                        dVar.p().c(false);
                        s sVar = dVar.p().f20821d;
                        sVar.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar, A, i132));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP = dVar.p();
                        i iVar = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar = dv.a.OPT_IN;
                        dv.d dVar2 = dv.d.DISMISSED;
                        A = dVar2 != null ? dVar2.a() : 0;
                        iVar.getClass();
                        aVar.getClass();
                        kVarP.f20820c.d(iVar, aVar, A);
                        dVar.dismiss();
                        break;
                    case 1:
                        pj.b bVar = new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("Details", bVar);
                        a aVar2 = new a();
                        aVar2.setArguments(bundle2);
                        aVar2.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 2:
                        pj.b bVar2 = new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q()));
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("Details", bVar2);
                        a aVar3 = new a();
                        aVar3.setArguments(bundle3);
                        aVar3.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 3:
                        s sVar2 = dVar.p().f20821d;
                        sVar2.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar2, A, i132));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP2 = dVar.p();
                        i iVar2 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar4 = dv.a.OPT_IN;
                        dv.d dVar3 = dv.d.NECESSARY;
                        String strA = dVar3 != null ? dVar3.a() : null;
                        iVar2.getClass();
                        aVar4.getClass();
                        kVarP2.f20820c.d(iVar2, aVar4, strA);
                        dVar.r();
                        break;
                    default:
                        gr.k kVarP3 = dVar.p();
                        s sVar3 = kVarP3.f20821d;
                        sVar3.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar3, A, i132));
                        f0.E(kotlin.coroutines.g.f26549a, new f3(sVar3, true, A, 4));
                        kVarP3.f20825h.k(Boolean.TRUE);
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP4 = dVar.p();
                        i iVar3 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar5 = dv.a.OPT_IN;
                        dv.d dVar4 = dv.d.EVERYTHING;
                        String strA2 = dVar4 != null ? dVar4.a() : null;
                        iVar3.getClass();
                        aVar5.getClass();
                        kVarP4.f20820c.d(iVar3, aVar5, strA2);
                        dVar.r();
                        break;
                }
            }
        });
        final int i15 = 4;
        zVar.f35293s.setOnClickListener(new View.OnClickListener(this) { // from class: bl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6333b;

            {
                this.f6333b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r8v9, types: [cv.b] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                int i122 = i15;
                int i132 = 2;
                d dVar = this.f6333b;
                switch (i122) {
                    case 0:
                        dVar.p().c(false);
                        s sVar = dVar.p().f20821d;
                        sVar.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar, A, i132));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP = dVar.p();
                        i iVar = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar = dv.a.OPT_IN;
                        dv.d dVar2 = dv.d.DISMISSED;
                        A = dVar2 != null ? dVar2.a() : 0;
                        iVar.getClass();
                        aVar.getClass();
                        kVarP.f20820c.d(iVar, aVar, A);
                        dVar.dismiss();
                        break;
                    case 1:
                        pj.b bVar = new pj.b(pj.a.BASIC_DATA_COLLECTION, R.string.privacy_tracking_consent_technically_necessary_header, R.string.trackingoptin_required_description, d0.d(ba0.g.w(), ba0.g.x(), ba0.g.q()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("Details", bVar);
                        a aVar2 = new a();
                        aVar2.setArguments(bundle2);
                        aVar2.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 2:
                        pj.b bVar2 = new pj.b(pj.a.MARKETING, R.string.privacy_tracking_consent_marketing_header, R.string.trackingoptin_marketing_description, d0.d(ba0.g.r(), ba0.g.s(), ba0.g.q()));
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("Details", bVar2);
                        a aVar3 = new a();
                        aVar3.setArguments(bundle3);
                        aVar3.show(dVar.getChildFragmentManager(), "Cookies Detail Fragment");
                        break;
                    case 3:
                        s sVar2 = dVar.p().f20821d;
                        sVar2.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar2, A, i132));
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP2 = dVar.p();
                        i iVar2 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar4 = dv.a.OPT_IN;
                        dv.d dVar3 = dv.d.NECESSARY;
                        String strA = dVar3 != null ? dVar3.a() : null;
                        iVar2.getClass();
                        aVar4.getClass();
                        kVarP2.f20820c.d(iVar2, aVar4, strA);
                        dVar.r();
                        break;
                    default:
                        gr.k kVarP3 = dVar.p();
                        s sVar3 = kVarP3.f20821d;
                        sVar3.getClass();
                        f0.E(kotlin.coroutines.g.f26549a, new q(sVar3, A, i132));
                        f0.E(kotlin.coroutines.g.f26549a, new f3(sVar3, true, A, 4));
                        kVarP3.f20825h.k(Boolean.TRUE);
                        if (dVar.p().b()) {
                            dVar.p().a();
                        }
                        dVar.p().d();
                        gr.k kVarP4 = dVar.p();
                        i iVar3 = i.ACTION_TRACKING_OPTIN;
                        dv.a aVar5 = dv.a.OPT_IN;
                        dv.d dVar4 = dv.d.EVERYTHING;
                        String strA2 = dVar4 != null ? dVar4.a() : null;
                        iVar3.getClass();
                        aVar5.getClass();
                        kVarP4.f20820c.d(iVar3, aVar5, strA2);
                        dVar.r();
                        break;
                }
            }
        });
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        z zVar2 = this.f6342g;
        zVar2.getClass();
        a0 a0Var = (a0) zVar2;
        a0Var.A = p();
        synchronized (a0Var) {
            a0Var.C |= 2;
        }
        a0Var.K(7);
        a0Var.e0();
        z zVar3 = this.f6342g;
        zVar3.getClass();
        Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        d dVar = zVar3.l;
        if (dVar != this) {
            if (dVar != null) {
                dVar.getLifecycle().d(zVar3.f992m);
            }
            zVar3.l = this;
            if (zVar3.f992m == null) {
                zVar3.f992m = new a8.j(zVar3);
            }
            getLifecycle().a(zVar3.f992m);
            a8.l[] lVarArr = zVar3.f985e;
            int length = lVarArr.length;
            while (i11 < length) {
                a8.l lVar = lVarArr[i11];
                if (lVar != null) {
                    lVar.f994a.b(this);
                }
                i11++;
            }
        }
        z zVar4 = this.f6342g;
        zVar4.getClass();
        TextView textView = zVar4.f35298x;
        textView.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string = contextRequireContext.getString(R.string.default_privacy_policy_link);
        string.getClass();
        x70.c cVar = null;
        mv.d.z(textView, m0.c.r0(contextRequireContext, R.string.trackingoptin_read_more_full_privacy_policy, R.string.trackingoptin_privacy_policy_link_part, string), null, 6);
        if (p().b()) {
            gr.k kVarP = p();
            f0.B(m1.d(kVarP), null, null, new gr.j(kVarP, cVar, i12), 3);
        }
    }

    public final gr.k p() {
        return (gr.k) this.f6341f.getValue();
    }

    public final void q() {
        if (this.f6336a == null) {
            this.f6336a = new k(super.getContext(), this);
            this.f6337b = b0.z.v(super.getContext());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "accepted"
            r2 = 1
            r0.putBoolean(r1, r2)
            androidx.fragment.app.FragmentManager r1 = r6.getParentFragmentManager()
            java.util.Map r2 = r1.f3119n
            java.lang.String r3 = "cookies_v2_result"
            java.lang.Object r2 = r2.get(r3)
            androidx.fragment.app.i1 r2 = (androidx.fragment.app.i1) r2
            if (r2 == 0) goto L2d
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            androidx.lifecycle.Lifecycle r5 = r2.f3232a
            androidx.lifecycle.Lifecycle$State r5 = r5.b()
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L2d
            r2.h(r0)
            goto L32
        L2d:
            java.util.Map r1 = r1.f3118m
            r1.put(r3, r0)
        L32:
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.L(r1)
            if (r1 == 0) goto L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Setting fragment result with key cookies_v2_result and result "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L4c:
            r6.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.d.r():void");
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        q();
        if (this.f6340e) {
            return;
        }
        this.f6340e = true;
        ((e) a()).getClass();
    }
}
