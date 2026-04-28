package com.app.tgtg.feature.tabprofile.storelogin.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.n1;
import androidx.lifecycle.o0;
import b5.r1;
import bg.w0;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.InputFieldView;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import pd.g;
import pg.a;
import u6.f;
import u70.l;
import u70.m;
import xj.c;
import y00.i4;
import z4.t1;
import zs.d;
import zs.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/storelogin/ui/RecommendStoreFragment;", "Lzs/j;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecommendStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendStoreFragment.kt\ncom/app/tgtg/feature/tabprofile/storelogin/ui/RecommendStoreFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,198:1\n106#2,15:199\n*S KotlinDebug\n*F\n+ 1 RecommendStoreFragment.kt\ncom/app/tgtg/feature/tabprofile/storelogin/ui/RecommendStoreFragment\n*L\n23#1:199,15\n*E\n"})
public final class RecommendStoreFragment extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f9446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f9447n;

    public RecommendStoreFragment() {
        super(R.layout.recommend_store_view);
        u70.j jVarA = l.a(m.NONE, new t1(new t1(this, 1), 2));
        this.f9447n = new n1(Reflection.getOrCreateKotlinClass(d.class), new c(jVarA, 8), new r1(24, this, jVarA), new c(jVarA, 9));
    }

    public static final void t(RecommendStoreFragment recommendStoreFragment) {
        a aVar = recommendStoreFragment.f9446m;
        aVar.getClass();
        ((Button) aVar.f34761c).setEnabled(recommendStoreFragment.u().f48067f.length() > 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.recommend_store_view, viewGroup, false);
        int i11 = R.id.btnNext;
        Button button = (Button) g.t(R.id.btnNext, viewInflate);
        if (button != null) {
            i11 = R.id.description;
            if (((TextView) g.t(R.id.description, viewInflate)) != null) {
                i11 = R.id.inputFieldEmail;
                InputFieldView inputFieldView = (InputFieldView) g.t(R.id.inputFieldEmail, viewInflate);
                if (inputFieldView != null) {
                    i11 = R.id.inputFieldName;
                    InputFieldView inputFieldView2 = (InputFieldView) g.t(R.id.inputFieldName, viewInflate);
                    if (inputFieldView2 != null) {
                        i11 = R.id.inputFieldPhoneNumber;
                        InputFieldView inputFieldView3 = (InputFieldView) g.t(R.id.inputFieldPhoneNumber, viewInflate);
                        if (inputFieldView3 != null) {
                            i11 = R.id.inputFieldPostalCode;
                            InputFieldView inputFieldView4 = (InputFieldView) g.t(R.id.inputFieldPostalCode, viewInflate);
                            if (inputFieldView4 != null) {
                                i11 = R.id.storeIcon;
                                if (((ImageView) g.t(R.id.storeIcon, viewInflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.f9446m = new a(constraintLayout, button, inputFieldView, inputFieldView2, inputFieldView3, inputFieldView4, 4);
                                    constraintLayout.getClass();
                                    return constraintLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // zs.j, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.f48091k != null) {
            ((TextView) o().f34795c).setText(getString(R.string.recommend_store_title));
        }
        a aVar = this.f9446m;
        aVar.getClass();
        ((InputFieldView) aVar.f34762d).setInputType(32);
        String phoneCountryCodeSuggestion = u().f48063b.n().getPhoneCountryCodeSuggestion();
        if (phoneCountryCodeSuggestion == null) {
            phoneCountryCodeSuggestion = "";
        }
        final int i11 = 0;
        if (!StringsKt.z(phoneCountryCodeSuggestion, "+", false)) {
            phoneCountryCodeSuggestion = "+".concat(phoneCountryCodeSuggestion);
        }
        a aVar2 = this.f9446m;
        aVar2.getClass();
        ((InputFieldView) aVar2.f34764f).setCountryCode(phoneCountryCodeSuggestion);
        u().f48070i = y.n(phoneCountryCodeSuggestion, "+", "", false);
        ((InputFieldView) aVar.f34764f).setInputType(3);
        d dVarU = u();
        o0 o0Var = dVarU.f48066e;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        m0.c.f0(o0Var, viewLifecycleOwner, new Function1(this) { // from class: zs.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendStoreFragment f48059b;

            {
                this.f48059b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i12 = i11;
                RecommendStoreFragment recommendStoreFragment = this.f48059b;
                switch (i12) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        w0 w0Var = recommendStoreFragment.f48089i;
                        if (zBooleanValue) {
                            if (w0Var == null) {
                                recommendStoreFragment.f48089i = new w0(recommendStoreFragment.getContext());
                            }
                            w0 w0Var2 = recommendStoreFragment.f48089i;
                            if (w0Var2 != null) {
                                w0Var2.b(recommendStoreFragment.getView());
                            }
                        } else if (w0Var != null) {
                            w0Var.a();
                        }
                        break;
                    case 1:
                        ((Throwable) obj).getClass();
                        Toast.makeText(recommendStoreFragment.getContext(), R.string.generic_err_undefined_error, 1).show();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        recommendStoreFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_recommendStoreFragment_to_recommendStoreSuccessFragment)));
                        break;
                }
                return Unit.f26487a;
            }
        });
        o0 o0Var2 = dVarU.f48065d;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        final int i12 = 1;
        m0.c.f0(o0Var2, viewLifecycleOwner2, new Function1(this) { // from class: zs.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendStoreFragment f48059b;

            {
                this.f48059b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i122 = i12;
                RecommendStoreFragment recommendStoreFragment = this.f48059b;
                switch (i122) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        w0 w0Var = recommendStoreFragment.f48089i;
                        if (zBooleanValue) {
                            if (w0Var == null) {
                                recommendStoreFragment.f48089i = new w0(recommendStoreFragment.getContext());
                            }
                            w0 w0Var2 = recommendStoreFragment.f48089i;
                            if (w0Var2 != null) {
                                w0Var2.b(recommendStoreFragment.getView());
                            }
                        } else if (w0Var != null) {
                            w0Var.a();
                        }
                        break;
                    case 1:
                        ((Throwable) obj).getClass();
                        Toast.makeText(recommendStoreFragment.getContext(), R.string.generic_err_undefined_error, 1).show();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        recommendStoreFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_recommendStoreFragment_to_recommendStoreSuccessFragment)));
                        break;
                }
                return Unit.f26487a;
            }
        });
        o0 o0Var3 = dVarU.f48072k;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        final int i13 = 2;
        m0.c.f0(o0Var3, viewLifecycleOwner3, new Function1(this) { // from class: zs.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendStoreFragment f48059b;

            {
                this.f48059b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i122 = i13;
                RecommendStoreFragment recommendStoreFragment = this.f48059b;
                switch (i122) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        w0 w0Var = recommendStoreFragment.f48089i;
                        if (zBooleanValue) {
                            if (w0Var == null) {
                                recommendStoreFragment.f48089i = new w0(recommendStoreFragment.getContext());
                            }
                            w0 w0Var2 = recommendStoreFragment.f48089i;
                            if (w0Var2 != null) {
                                w0Var2.b(recommendStoreFragment.getView());
                            }
                        } else if (w0Var != null) {
                            w0Var.a();
                        }
                        break;
                    case 1:
                        ((Throwable) obj).getClass();
                        Toast.makeText(recommendStoreFragment.getContext(), R.string.generic_err_undefined_error, 1).show();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        recommendStoreFragment.p().f48104g.i(new qt.a(Integer.valueOf(R.id.action_recommendStoreFragment_to_recommendStoreSuccessFragment)));
                        break;
                }
                return Unit.f26487a;
            }
        });
        a aVar3 = this.f9446m;
        aVar3.getClass();
        ((InputFieldView) aVar3.f34763e).setTextChangeListener(new zs.c(this, 0));
        ((InputFieldView) aVar3.f34762d).setTextChangeListener(new t10.c(this));
        InputFieldView inputFieldView = (InputFieldView) aVar3.f34764f;
        inputFieldView.setCountryCodeTextChangeListener(new i4(this, 7));
        inputFieldView.setTextChangeListener(new f(this));
        ((InputFieldView) aVar3.f34765g).setTextChangeListener(new zs.c(this, 1));
        mv.d.x((Button) aVar3.f34761c, new xq.a(22, this, aVar3));
    }

    public final d u() {
        return (d) this.f9447n.getValue();
    }
}
