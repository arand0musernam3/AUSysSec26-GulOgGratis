package com.app.tgtg.customview.manufactureaddressfragment;

import a3.i3;
import a3.y;
import al.i;
import android.content.Context;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.e;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import bg.w0;
import c50.w;
import cj.e0;
import cj.q;
import com.app.tgtg.R;
import com.app.tgtg.customview.NoChangingBackgroundTextInputLayout;
import com.app.tgtg.customview.manufactureaddressfragment.AddressEditText;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.response.AddressField;
import com.app.tgtg.model.remote.user.response.AddressViolation;
import e.b;
import fl.f;
import fn.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import jg.a0;
import jg.c0;
import jg.d;
import jg.g0;
import jg.i0;
import jg.j;
import jg.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import pd.g;
import pg.r;
import sa0.a;
import u70.l;
import u70.t;
import v80.f0;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/tgtg/customview/manufactureaddressfragment/XmlCheckoutAddressFragment;", "", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXmlCheckoutAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlCheckoutAddressFragment.kt\ncom/app/tgtg/customview/manufactureaddressfragment/XmlCheckoutAddressFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ExceptionHandlingUtil.kt\ncom/tgtg/core/common/util/ExceptionHandlingUtilKt\n*L\n1#1,1397:1\n172#2,9:1398\n172#2,9:1407\n363#3,7:1416\n1586#3:1423\n1661#3,3:1424\n1586#3:1427\n1661#3,3:1428\n1586#3:1431\n1661#3,3:1432\n1915#3,2:1435\n1807#3,3:1439\n1807#3,3:1442\n1807#3,3:1445\n1807#3,3:1448\n1807#3,3:1451\n1807#3,3:1454\n1807#3,3:1457\n1807#3,3:1460\n1807#3,3:1463\n1807#3,3:1466\n1807#3,3:1469\n1807#3,3:1472\n257#4,2:1437\n15#5,6:1475\n*S KotlinDebug\n*F\n+ 1 XmlCheckoutAddressFragment.kt\ncom/app/tgtg/customview/manufactureaddressfragment/XmlCheckoutAddressFragment\n*L\n54#1:1398,9\n55#1:1407,9\n166#1:1416,7\n212#1:1423\n212#1:1424,3\n354#1:1427\n354#1:1428,3\n359#1:1431\n359#1:1432,3\n362#1:1435,2\n824#1:1439,3\n835#1:1442,3\n908#1:1445,3\n922#1:1448,3\n984#1:1451,3\n997#1:1454,3\n1129#1:1457,3\n1151#1:1460,3\n1173#1:1463,3\n1184#1:1466,3\n1268#1:1469,3\n1280#1:1472,3\n572#1:1437,2\n1304#1:1475,6\n*E\n"})
public final class XmlCheckoutAddressFragment extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f8932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f8933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r f8936k;
    public j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f8937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public UserAddress f8938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f8939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f8940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f8941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a0 f8942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i3 f8943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f8944t;

    public XmlCheckoutAddressFragment() {
        super(0);
        this.f8932g = new n1(Reflection.getOrCreateKotlinClass(e0.class), new j0(this, 0), new j0(this, 2), new j0(this, 1));
        this.f8933h = new n1(Reflection.getOrCreateKotlinClass(q.class), new j0(this, 3), new j0(this, 5), new j0(this, 4));
        this.f8935j = "";
        this.f8937m = l.b(new c0(this, 1));
        this.f8941q = new LinkedHashMap();
        this.f8944t = new i(this, 2);
    }

    public final void A() {
        r rVar = this.f8936k;
        r rVar2 = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        rVar.K.requestFocus();
        r rVar3 = this.f8936k;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        Object systemService = rVar3.f35089a.getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        r rVar4 = this.f8936k;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar2 = rVar4;
        }
        inputMethodManager.hideSoftInputFromWindow(rVar2.f35089a.getWindowToken(), 0);
    }

    public final boolean B(AddressField addressField, String str) {
        j jVar = this.l;
        j jVar2 = null;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar = null;
        }
        String strI = jVar.i(addressField);
        if (strI == null || strI.length() == 0 || str == null || str.length() == 0) {
            return true;
        }
        try {
            j jVar3 = this.l;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            } else {
                jVar2 = jVar3;
            }
            String strI2 = jVar2.i(addressField);
            strI2.getClass();
            return new Regex(strI2).e(StringsKt.e0(str).toString());
        } catch (Throwable th2) {
            a.f38953a.d(th2);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r11.equals("US") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (r11.equals("IT") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        r11 = r40.f8942r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("xmlAddressUiHelper");
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r11.f();
        r11 = com.app.tgtg.model.remote.user.response.AddressField.ADDRESS_LINE1;
        r12 = r40.f8936k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (r12 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        r11 = E(r11, r12.f35090b);
        r14 = I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        if (r11.equals("GB") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        if (r11.equals("FR") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0105, code lost:
    
        if (r11.equals("DK") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0136, code lost:
    
        r11 = com.app.tgtg.model.remote.user.response.AddressField.ADDRESS_LINE1;
        r12 = r40.f8936k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013a, code lost:
    
        if (r12 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        r11 = E(r11, r12.f35090b);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment.C():void");
    }

    public final boolean D() {
        String strU;
        BasicItem basicItemF = ((q) this.f8933h.getValue()).f();
        j jVar = null;
        boolean z11 = true;
        if ((basicItemF != null ? basicItemF.getItemType() : null) == ItemType.CATERING && (((strU = u()) == null || strU.length() <= 0) && !w())) {
            z11 = false;
        }
        if (z11) {
            r rVar = this.f8936k;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar = null;
            }
            final int i11 = 1;
            rVar.f35102o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: jg.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ XmlCheckoutAddressFragment f25174b;

                {
                    this.f25174b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    switch (i11) {
                        case 0:
                            XmlCheckoutAddressFragment xmlCheckoutAddressFragment = this.f25174b;
                            pg.r rVar2 = xmlCheckoutAddressFragment.f8936k;
                            if (rVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                rVar2 = null;
                            }
                            AddressEditText addressEditText = rVar2.l;
                            addressEditText.setEnable(!z12);
                            if (z12) {
                                xmlCheckoutAddressFragment.D();
                                addressEditText.setEtText("");
                            }
                            break;
                        default:
                            pg.r rVar3 = this.f25174b.f8936k;
                            if (rVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                rVar3 = null;
                            }
                            AddressEditText addressEditText2 = rVar3.l;
                            addressEditText2.setEnable(!z12);
                            if (z12) {
                                addressEditText2.setEtText("");
                            }
                            break;
                    }
                }
            });
            r rVar2 = this.f8936k;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar2 = null;
            }
            rVar2.l.setError(null);
            return z11;
        }
        AddressField addressField = AddressField.DELIVERY_ACCESS_CODE;
        r rVar3 = this.f8936k;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar3 = null;
        }
        t(addressField, rVar3.l.getEt());
        r rVar4 = this.f8936k;
        if (rVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar4 = null;
        }
        final int i12 = 0;
        rVar4.f35102o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: jg.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ XmlCheckoutAddressFragment f25174b;

            {
                this.f25174b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                switch (i12) {
                    case 0:
                        XmlCheckoutAddressFragment xmlCheckoutAddressFragment = this.f25174b;
                        pg.r rVar22 = xmlCheckoutAddressFragment.f8936k;
                        if (rVar22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar22 = null;
                        }
                        AddressEditText addressEditText = rVar22.l;
                        addressEditText.setEnable(!z12);
                        if (z12) {
                            xmlCheckoutAddressFragment.D();
                            addressEditText.setEtText("");
                        }
                        break;
                    default:
                        pg.r rVar32 = this.f25174b.f8936k;
                        if (rVar32 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar32 = null;
                        }
                        AddressEditText addressEditText2 = rVar32.l;
                        addressEditText2.setEnable(!z12);
                        if (z12) {
                            addressEditText2.setEtText("");
                        }
                        break;
                }
            }
        });
        r rVar5 = this.f8936k;
        if (rVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar5 = null;
        }
        AddressEditText addressEditText = rVar5.l;
        j jVar2 = this.l;
        if (jVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
        } else {
            jVar = jVar2;
        }
        addressEditText.setError(jVar.c(addressField));
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0117 A[EDGE_INSN: B:111:0x0117->B:70:0x0117 BREAK  A[LOOP:1: B:46:0x00a6->B:114:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(com.app.tgtg.model.remote.user.response.AddressField r10, com.app.tgtg.customview.manufactureaddressfragment.AddressEditText r11) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment.E(com.app.tgtg.model.remote.user.response.AddressField, com.app.tgtg.customview.manufactureaddressfragment.AddressEditText):boolean");
    }

    public final boolean F() {
        r rVar = this.f8936k;
        j jVar = null;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        j jVar2 = this.l;
        if (jVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar2 = null;
        }
        AddressField addressField = AddressField.EMAIL;
        if (!jVar2.e(addressField)) {
            j jVar3 = this.l;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                jVar3 = null;
            }
            jVar3.n(addressField);
            t(addressField, rVar.f35103p.getEt());
        }
        if (this.f8934i) {
            r rVar2 = this.f8936k;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar2 = null;
            }
            ArrayList arrayList = this.f8939o;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AddressViolation addressViolation = (AddressViolation) it.next();
                        AddressField field = addressViolation != null ? addressViolation.getField() : null;
                        AddressField addressField2 = AddressField.EMAIL;
                        if (field == addressField2) {
                            if (!rVar2.f35103p.getEt().hasFocus()) {
                                AddressEditText addressEditText = rVar2.f35103p;
                                j jVar4 = this.l;
                                if (jVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                                    jVar4 = null;
                                }
                                addressEditText.setError(jVar4.c(addressField2));
                                j jVar5 = this.l;
                                if (jVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                                } else {
                                    jVar = jVar5;
                                }
                                jVar.m(addressField2, false);
                                return false;
                            }
                        }
                    }
                }
                rVar2.f35103p.setError(null);
                j jVar6 = this.l;
                if (jVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar6 = null;
                }
                jVar6.m(AddressField.EMAIL, true);
                ArrayList arrayList2 = this.f8939o;
                arrayList2.getClass();
                arrayList2.removeIf(new h(new im.a(10), 7));
            }
            ArrayList arrayList3 = this.f8940p;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AddressViolation addressViolation2 = (AddressViolation) it2.next();
                    AddressField field2 = addressViolation2 != null ? addressViolation2.getField() : null;
                    AddressField addressField3 = AddressField.EMAIL;
                    if (field2 == addressField3) {
                        AddressEditText addressEditText2 = rVar2.f35103p;
                        if (addressEditText2.getEtText().length() <= 0 || y(addressField3) == null || Intrinsics.areEqual(addressEditText2.getEtText(), y(addressField3))) {
                            j jVar7 = this.l;
                            if (jVar7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                                jVar7 = null;
                            }
                            addressEditText2.setError(jVar7.c(addressField3));
                            j jVar8 = this.l;
                            if (jVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                            } else {
                                jVar = jVar8;
                            }
                            jVar.m(addressField3, false);
                            return false;
                        }
                        ArrayList arrayList4 = this.f8940p;
                        arrayList4.getClass();
                        arrayList4.removeIf(new h(new im.a(11), 8));
                    }
                }
            }
        }
        j jVar9 = this.l;
        if (jVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar9 = null;
        }
        AddressField addressField4 = AddressField.EMAIL;
        if (jVar9.j(addressField4) && rVar.f35103p.getEtText().length() == 0) {
            AddressEditText addressEditText3 = rVar.f35103p;
            j jVar10 = this.l;
            if (jVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                jVar10 = null;
            }
            String string = jVar10.f25190c.getString(R.string.mnu_checkout_address_validation_required);
            string.getClass();
            addressEditText3.setError(string);
            j jVar11 = this.l;
            if (jVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            } else {
                jVar = jVar11;
            }
            jVar.m(addressField4, false);
            return false;
        }
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        AddressEditText addressEditText4 = rVar.f35103p;
        if (pattern.matcher(addressEditText4.getEtText()).matches() && B(addressField4, addressEditText4.getEtText())) {
            addressEditText4.setError(null);
            j jVar12 = this.l;
            if (jVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            } else {
                jVar = jVar12;
            }
            jVar.m(addressField4, true);
            return true;
        }
        Context context = getContext();
        addressEditText4.setError(context != null ? context.getString(R.string.mnu_checkout_address_validation_email) : null);
        j jVar13 = this.l;
        if (jVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
        } else {
            jVar = jVar13;
        }
        jVar.m(addressField4, false);
        return false;
    }

    public final boolean G() {
        r rVar = this.f8936k;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        j jVar = this.l;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar = null;
        }
        AddressField addressField = AddressField.NAME;
        if (!jVar.e(addressField)) {
            j jVar2 = this.l;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                jVar2 = null;
            }
            jVar2.n(addressField);
            t(addressField, rVar.f35108u.getEt());
        }
        boolean z11 = false;
        boolean z12 = true;
        if (this.f8934i) {
            r rVar2 = this.f8936k;
            if (rVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar2 = null;
            }
            ArrayList arrayList = this.f8939o;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    rVar2.f35108u.setError(null);
                    ArrayList arrayList2 = this.f8939o;
                    arrayList2.getClass();
                    arrayList2.removeIf(new h(new im.a(12), 9));
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AddressViolation addressViolation = (AddressViolation) it.next();
                        AddressField field = addressViolation != null ? addressViolation.getField() : null;
                        AddressField addressField2 = AddressField.NAME;
                        if (field == addressField2) {
                            if (!rVar2.f35108u.getEt().hasFocus()) {
                                AddressEditText addressEditText = rVar2.f35108u;
                                j jVar3 = this.l;
                                if (jVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                                    jVar3 = null;
                                }
                                addressEditText.setError(jVar3.c(addressField2));
                                z12 = false;
                            }
                        }
                    }
                    rVar2.f35108u.setError(null);
                    ArrayList arrayList22 = this.f8939o;
                    arrayList22.getClass();
                    arrayList22.removeIf(new h(new im.a(12), 9));
                }
            }
            ArrayList arrayList3 = this.f8940p;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AddressViolation addressViolation2 = (AddressViolation) it2.next();
                    AddressField field2 = addressViolation2 != null ? addressViolation2.getField() : null;
                    AddressField addressField3 = AddressField.NAME;
                    if (field2 == addressField3) {
                        AddressEditText addressEditText2 = rVar2.f35108u;
                        if (addressEditText2.getEtText().length() <= 0 || y(addressField3) == null || Intrinsics.areEqual(addressEditText2.getEtText(), y(addressField3))) {
                            j jVar4 = this.l;
                            if (jVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                                jVar4 = null;
                            }
                            addressEditText2.setError(jVar4.c(addressField3));
                            z12 = false;
                        } else {
                            ArrayList arrayList4 = this.f8940p;
                            arrayList4.getClass();
                            arrayList4.removeIf(new h(new im.a(13), 10));
                        }
                    }
                }
            }
        }
        AddressField addressField4 = AddressField.NAME;
        AddressEditText addressEditText3 = rVar.f35108u;
        if (!B(addressField4, addressEditText3.getEtText())) {
            j jVar5 = this.l;
            if (jVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                jVar5 = null;
            }
            addressEditText3.setError(jVar5.c(addressField4));
            z12 = false;
        }
        j jVar6 = this.l;
        if (jVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar6 = null;
        }
        if (jVar6.j(addressField4) && addressEditText3.getEtText().length() == 0) {
            j jVar7 = this.l;
            if (jVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                jVar7 = null;
            }
            String string = jVar7.f25190c.getString(R.string.mnu_checkout_address_validation_required);
            string.getClass();
            addressEditText3.setError(string);
        } else {
            z11 = z12;
        }
        j jVar8 = this.l;
        if (jVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar8 = null;
        }
        jVar8.m(addressField4, z11);
        if (z11) {
            addressEditText3.setError(null);
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017f A[EDGE_INSN: B:257:0x017f->B:106:0x017f BREAK  A[LOOP:3: B:108:0x0186->B:258:?]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x016d A[EDGE_INSN: B:253:0x016d->B:99:0x016d BREAK  A[LOOP:2: B:80:0x0102->B:255:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment.H():boolean");
    }

    public final boolean I() {
        String strG;
        j jVar = this.l;
        j jVar2 = null;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar = null;
        }
        AddressField addressField = AddressField.STATE;
        if (!jVar.e(addressField)) {
            j jVar3 = this.l;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                jVar3 = null;
            }
            jVar3.n(addressField);
            r rVar = this.f8936k;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar = null;
            }
            rVar.H.addTextChangedListener(new f(this, 1));
        }
        if (this.f8934i) {
            ArrayList arrayList = this.f8940p;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AddressViolation addressViolation = (AddressViolation) it.next();
                    AddressField field = addressViolation != null ? addressViolation.getField() : null;
                    AddressField addressField2 = AddressField.STATE;
                    if (field == addressField2) {
                        r rVar2 = this.f8936k;
                        if (rVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar2 = null;
                        }
                        if (rVar2.H.getText().toString().length() > 0 && y(addressField2) != null) {
                            r rVar3 = this.f8936k;
                            if (rVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                rVar3 = null;
                            }
                            if (!Intrinsics.areEqual(rVar3.H.getText().toString(), y(addressField2))) {
                                ArrayList arrayList2 = this.f8940p;
                                arrayList2.getClass();
                                arrayList2.removeIf(new h(new im.a(9), 6));
                            }
                        }
                        r rVar4 = this.f8936k;
                        if (rVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar4 = null;
                        }
                        rVar4.D.setBackgroundResource(R.drawable.checkout_address_background_error);
                        j jVar4 = this.l;
                        if (jVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                        } else {
                            jVar2 = jVar4;
                        }
                        jVar2.m(addressField2, false);
                        return false;
                    }
                }
            }
            ArrayList<AddressViolation> arrayList3 = this.f8939o;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (AddressViolation addressViolation2 : arrayList3) {
                    AddressField field2 = addressViolation2 != null ? addressViolation2.getField() : null;
                    AddressField addressField3 = AddressField.STATE;
                    if (field2 == addressField3) {
                        r rVar5 = this.f8936k;
                        if (rVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar5 = null;
                        }
                        rVar5.D.setBackgroundResource(R.drawable.checkout_address_background_error);
                        j jVar5 = this.l;
                        if (jVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                        } else {
                            jVar2 = jVar5;
                        }
                        jVar2.m(addressField3, false);
                        return false;
                    }
                }
            }
        }
        j jVar6 = this.l;
        if (jVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar6 = null;
        }
        AddressField addressField4 = AddressField.STATE;
        if (jVar6.j(addressField4)) {
            a0 a0Var = this.f8942r;
            if (a0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("xmlAddressUiHelper");
                a0Var = null;
            }
            String str = a0Var.f25161r;
            if (str == null || str.length() == 0) {
                r rVar6 = this.f8936k;
                if (rVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar6 = null;
                }
                TextView textView = rVar6.I;
                boolean zAreEqual = Intrinsics.areEqual(this.f8935j, "US");
                r rVar7 = this.f8936k;
                if (zAreEqual) {
                    if (rVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rVar7 = null;
                    }
                    strG = e.g(rVar7.f35089a.getContext(), R.string.mnu_checkout_address_state_validation_missing);
                } else {
                    if (rVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rVar7 = null;
                    }
                    strG = e.g(rVar7.f35089a.getContext(), R.string.mnu_checkout_address_province_validation_missing);
                }
                textView.setText(strG);
                r rVar8 = this.f8936k;
                if (rVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar8 = null;
                }
                rVar8.I.setVisibility(0);
                r rVar9 = this.f8936k;
                if (rVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rVar9 = null;
                }
                rVar9.D.setBackgroundResource(R.drawable.checkout_address_background_error);
                j jVar7 = this.l;
                if (jVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar2 = jVar7;
                }
                jVar2.m(addressField4, false);
                return false;
            }
        }
        r rVar10 = this.f8936k;
        if (rVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar10 = null;
        }
        rVar10.I.setVisibility(8);
        r rVar11 = this.f8936k;
        if (rVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar11 = null;
        }
        rVar11.D.setBackgroundResource(R.drawable.checkout_address_background);
        j jVar8 = this.l;
        if (jVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
        } else {
            jVar2 = jVar8;
        }
        jVar2.m(addressField4, true);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.checkout_address_view, viewGroup, false);
        int i11 = R.id.address1EtBlock;
        AddressEditText addressEditText = (AddressEditText) g.t(R.id.address1EtBlock, viewInflate);
        if (addressEditText != null) {
            i11 = R.id.address2EtBlock;
            AddressEditText addressEditText2 = (AddressEditText) g.t(R.id.address2EtBlock, viewInflate);
            if (addressEditText2 != null) {
                i11 = R.id.addressFieldLayout;
                LinearLayout linearLayout = (LinearLayout) g.t(R.id.addressFieldLayout, viewInflate);
                if (linearLayout != null) {
                    i11 = R.id.bottomCorrectionLayout;
                    FrameLayout frameLayout = (FrameLayout) g.t(R.id.bottomCorrectionLayout, viewInflate);
                    if (frameLayout != null) {
                        i11 = R.id.btnContinue;
                        Button button = (Button) g.t(R.id.btnContinue, viewInflate);
                        if (button != null) {
                            i11 = R.id.btnDeleteAddress;
                            TextView textView = (TextView) g.t(R.id.btnDeleteAddress, viewInflate);
                            if (textView != null) {
                                i11 = R.id.cateringLayout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) g.t(R.id.cateringLayout, viewInflate);
                                if (constraintLayout != null) {
                                    i11 = R.id.cityEtBlock;
                                    AddressEditText addressEditText3 = (AddressEditText) g.t(R.id.cityEtBlock, viewInflate);
                                    if (addressEditText3 != null) {
                                        i11 = R.id.countryEtBlock;
                                        AddressEditText addressEditText4 = (AddressEditText) g.t(R.id.countryEtBlock, viewInflate);
                                        if (addressEditText4 != null) {
                                            i11 = R.id.countryWarningTv;
                                            TextView textView2 = (TextView) g.t(R.id.countryWarningTv, viewInflate);
                                            if (textView2 != null) {
                                                i11 = R.id.deliveryAccessCodeEtBlock;
                                                AddressEditText addressEditText5 = (AddressEditText) g.t(R.id.deliveryAccessCodeEtBlock, viewInflate);
                                                if (addressEditText5 != null) {
                                                    i11 = R.id.deliveryInfoLayout;
                                                    LinearLayout linearLayout2 = (LinearLayout) g.t(R.id.deliveryInfoLayout, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i11 = R.id.deliveryInstructionsEtBlock;
                                                        AddressEditText addressEditText6 = (AddressEditText) g.t(R.id.deliveryInstructionsEtBlock, viewInflate);
                                                        if (addressEditText6 != null) {
                                                            i11 = R.id.deliveryNoAccessCodeNeededCB;
                                                            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) g.t(R.id.deliveryNoAccessCodeNeededCB, viewInflate);
                                                            if (appCompatCheckBox != null) {
                                                                i11 = R.id.deliveryNoAccessCodeNeededLabel;
                                                                if (((TextView) g.t(R.id.deliveryNoAccessCodeNeededLabel, viewInflate)) != null) {
                                                                    i11 = R.id.emailEtBlock;
                                                                    AddressEditText addressEditText7 = (AddressEditText) g.t(R.id.emailEtBlock, viewInflate);
                                                                    if (addressEditText7 != null) {
                                                                        i11 = R.id.etCountryCode;
                                                                        EditText editText = (EditText) g.t(R.id.etCountryCode, viewInflate);
                                                                        if (editText != null) {
                                                                            i11 = R.id.etPhone;
                                                                            EditText editText2 = (EditText) g.t(R.id.etPhone, viewInflate);
                                                                            if (editText2 != null) {
                                                                                i11 = R.id.homeRb;
                                                                                RadioButton radioButton = (RadioButton) g.t(R.id.homeRb, viewInflate);
                                                                                if (radioButton != null) {
                                                                                    i11 = R.id.ibClose;
                                                                                    ImageButton imageButton = (ImageButton) g.t(R.id.ibClose, viewInflate);
                                                                                    if (imageButton != null) {
                                                                                        i11 = R.id.nameEtBlock;
                                                                                        AddressEditText addressEditText8 = (AddressEditText) g.t(R.id.nameEtBlock, viewInflate);
                                                                                        if (addressEditText8 != null) {
                                                                                            i11 = R.id.nestedView;
                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) g.t(R.id.nestedView, viewInflate);
                                                                                            if (constraintLayout2 != null) {
                                                                                                i11 = R.id.nlAddressLayout;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) g.t(R.id.nlAddressLayout, viewInflate);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i11 = R.id.nlHNAdditionEtBlock;
                                                                                                    AddressEditText addressEditText9 = (AddressEditText) g.t(R.id.nlHNAdditionEtBlock, viewInflate);
                                                                                                    if (addressEditText9 != null) {
                                                                                                        i11 = R.id.nlHouseNumberEtBlock;
                                                                                                        AddressEditText addressEditText10 = (AddressEditText) g.t(R.id.nlHouseNumberEtBlock, viewInflate);
                                                                                                        if (addressEditText10 != null) {
                                                                                                            i11 = R.id.otherRb;
                                                                                                            RadioButton radioButton2 = (RadioButton) g.t(R.id.otherRb, viewInflate);
                                                                                                            if (radioButton2 != null) {
                                                                                                                i11 = R.id.phoneLabel;
                                                                                                                TextView textView3 = (TextView) g.t(R.id.phoneLabel, viewInflate);
                                                                                                                if (textView3 != null) {
                                                                                                                    i11 = R.id.phoneValidationLabel;
                                                                                                                    TextView textView4 = (TextView) g.t(R.id.phoneValidationLabel, viewInflate);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i11 = R.id.postalCodeEtBlock;
                                                                                                                        AddressEditText addressEditText11 = (AddressEditText) g.t(R.id.postalCodeEtBlock, viewInflate);
                                                                                                                        if (addressEditText11 != null) {
                                                                                                                            i11 = R.id.provinceClickLayout;
                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) g.t(R.id.provinceClickLayout, viewInflate);
                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                i11 = R.id.provinceLabel;
                                                                                                                                TextView textView5 = (TextView) g.t(R.id.provinceLabel, viewInflate);
                                                                                                                                if (textView5 != null) {
                                                                                                                                    i11 = R.id.provinceLayout;
                                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) g.t(R.id.provinceLayout, viewInflate);
                                                                                                                                    if (linearLayout4 != null) {
                                                                                                                                        i11 = R.id.provinceSelectorIcon;
                                                                                                                                        ImageView imageView = (ImageView) g.t(R.id.provinceSelectorIcon, viewInflate);
                                                                                                                                        if (imageView != null) {
                                                                                                                                            i11 = R.id.provinceTv;
                                                                                                                                            TextView textView6 = (TextView) g.t(R.id.provinceTv, viewInflate);
                                                                                                                                            if (textView6 != null) {
                                                                                                                                                i11 = R.id.provinceValidationLabel;
                                                                                                                                                TextView textView7 = (TextView) g.t(R.id.provinceValidationLabel, viewInflate);
                                                                                                                                                if (textView7 != null) {
                                                                                                                                                    i11 = R.id.radioGroup;
                                                                                                                                                    RadioGroup radioGroup = (RadioGroup) g.t(R.id.radioGroup, viewInflate);
                                                                                                                                                    if (radioGroup != null) {
                                                                                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                                                                                                                        i11 = R.id.searchFieldComposeContainer;
                                                                                                                                                        ComposeView composeView = (ComposeView) g.t(R.id.searchFieldComposeContainer, viewInflate);
                                                                                                                                                        if (composeView != null) {
                                                                                                                                                            i11 = R.id.sectionHeaderAddressTv;
                                                                                                                                                            if (((TextView) g.t(R.id.sectionHeaderAddressTv, viewInflate)) != null) {
                                                                                                                                                                i11 = R.id.sectionHeaderCateringDeliveryTv;
                                                                                                                                                                TextView textView8 = (TextView) g.t(R.id.sectionHeaderCateringDeliveryTv, viewInflate);
                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                    i11 = R.id.sectionHeaderContactTv;
                                                                                                                                                                    if (((TextView) g.t(R.id.sectionHeaderContactTv, viewInflate)) != null) {
                                                                                                                                                                        i11 = R.id.tilCountryCode;
                                                                                                                                                                        NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout = (NoChangingBackgroundTextInputLayout) g.t(R.id.tilCountryCode, viewInflate);
                                                                                                                                                                        if (noChangingBackgroundTextInputLayout != null) {
                                                                                                                                                                            i11 = R.id.title;
                                                                                                                                                                            TextView textView9 = (TextView) g.t(R.id.title, viewInflate);
                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                i11 = R.id.typeCheckLayout;
                                                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) g.t(R.id.typeCheckLayout, viewInflate);
                                                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                                                    i11 = R.id.workRb;
                                                                                                                                                                                    RadioButton radioButton3 = (RadioButton) g.t(R.id.workRb, viewInflate);
                                                                                                                                                                                    if (radioButton3 != null) {
                                                                                                                                                                                        this.f8936k = new r(constraintLayout3, addressEditText, addressEditText2, linearLayout, frameLayout, button, textView, constraintLayout, addressEditText3, addressEditText4, textView2, addressEditText5, linearLayout2, addressEditText6, appCompatCheckBox, addressEditText7, editText, editText2, radioButton, imageButton, addressEditText8, constraintLayout2, linearLayout3, addressEditText9, addressEditText10, radioButton2, textView3, textView4, addressEditText11, frameLayout2, textView5, linearLayout4, imageView, textView6, textView7, radioGroup, constraintLayout3, composeView, textView8, noChangingBackgroundTextInputLayout, textView9, linearLayout5, radioButton3);
                                                                                                                                                                                        constraintLayout3.getClass();
                                                                                                                                                                                        return constraintLayout3;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        x().V = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        i3 i3Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        x().S = null;
        this.f8941q.clear();
        this.f8935j = x().d();
        r rVar = this.f8936k;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        this.f8942r = new a0(rVar, x(), this.f8935j, this);
        r rVar2 = this.f8936k;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar2 = null;
        }
        e0 e0VarX = x();
        rVar2.getClass();
        e0VarX.getClass();
        i3 i3Var2 = new i3();
        i3Var2.f395b = rVar2;
        i3Var2.f396c = e0VarX;
        this.f8943s = i3Var2;
        a0 a0Var = this.f8942r;
        if (a0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xmlAddressUiHelper");
            a0Var = null;
        }
        a0Var.f25152h = x().T;
        a0 a0Var2 = this.f8942r;
        if (a0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xmlAddressUiHelper");
            a0Var2 = null;
        }
        if (a0Var2.f25152h != null && (getActivity() instanceof AccountDetailsActivity)) {
            r rVar3 = this.f8936k;
            if (rVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rVar3 = null;
            }
            ViewCompat.k0(rVar3.f35089a, new b(this, 24));
        }
        f0.B(m1.c(this), null, null, new i0(this, objArr6 == true ? 1 : 0, 0), 3);
        f0.B(m1.c(this), null, null, new i0(this, objArr5 == true ? 1 : 0, 1), 3);
        f0.B(m1.c(this), null, null, new i0(this, objArr4 == true ? 1 : 0, 2), 3);
        f0.B(m1.c(this), null, null, new y((Object) this, (c) (objArr3 == true ? 1 : 0), 16), 3);
        f0.B(m1.c(this), null, null, new i0(this, objArr2 == true ? 1 : 0, 3), 3);
        f0.B(m1.c(this), null, null, new i0(this, objArr == true ? 1 : 0, 4), 3);
        av.e eVar = (av.e) x().M.getValue();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        eVar.e(viewLifecycleOwner, this.f8944t);
        e0 e0VarX2 = x();
        f0.B(m1.d(e0VarX2), null, null, new cj.t(e0VarX2, null), 3);
        i3 i3Var3 = this.f8943s;
        if (i3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xmlAddressPrefillHelper");
        } else {
            i3Var = i3Var3;
        }
        r rVar4 = (r) i3Var.f395b;
        if (i3Var.p()) {
            return;
        }
        rVar4.L.setVisibility(0);
        rVar4.L.setContent(new u3.d(new jg.r(i3Var, 0), true, 1121058462));
    }

    public final void s(AddressField addressField) {
        j jVar = null;
        j jVar2 = null;
        j jVar3 = null;
        r rVar = null;
        r rVar2 = null;
        r rVar3 = null;
        r rVar4 = null;
        r rVar5 = null;
        r rVar6 = null;
        r rVar7 = null;
        j jVar4 = null;
        j jVar5 = null;
        j jVar6 = null;
        switch (jg.e0.$EnumSwitchMapping$0[addressField.ordinal()]) {
            case 1:
                j jVar7 = this.l;
                if (jVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar = jVar7;
                }
                jVar.m(addressField, G());
                break;
            case 2:
                j jVar8 = this.l;
                if (jVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar6 = jVar8;
                }
                jVar6.m(addressField, F());
                break;
            case 3:
                j jVar9 = this.l;
                if (jVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar5 = jVar9;
                }
                jVar5.m(addressField, H());
                break;
            case 4:
                j jVar10 = this.l;
                if (jVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar4 = jVar10;
                }
                jVar4.m(addressField, H());
                break;
            case 5:
                j jVar11 = this.l;
                if (jVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar11 = null;
                }
                AddressField addressField2 = AddressField.ADDRESS_LINE1;
                r rVar8 = this.f8936k;
                if (rVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar7 = rVar8;
                }
                jVar11.m(addressField, E(addressField2, rVar7.f35090b));
                break;
            case 6:
                j jVar12 = this.l;
                if (jVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar12 = null;
                }
                AddressField addressField3 = AddressField.ADDRESS_LINE2;
                r rVar9 = this.f8936k;
                if (rVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar6 = rVar9;
                }
                jVar12.m(addressField, E(addressField3, rVar6.f35091c));
                break;
            case 7:
                j jVar13 = this.l;
                if (jVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar13 = null;
                }
                AddressField addressField4 = AddressField.STREET_NAME;
                r rVar10 = this.f8936k;
                if (rVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar5 = rVar10;
                }
                jVar13.m(addressField, E(addressField4, rVar5.f35090b));
                break;
            case 8:
                j jVar14 = this.l;
                if (jVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar14 = null;
                }
                AddressField addressField5 = AddressField.HOUSE_NUMBER;
                r rVar11 = this.f8936k;
                if (rVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar4 = rVar11;
                }
                jVar14.m(addressField, E(addressField5, rVar4.f35112y));
                break;
            case 9:
                j jVar15 = this.l;
                if (jVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar15 = null;
                }
                AddressField addressField6 = AddressField.HOUSE_NUMBER_ADDITION;
                r rVar12 = this.f8936k;
                if (rVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar3 = rVar12;
                }
                jVar15.m(addressField, E(addressField6, rVar3.f35111x));
                break;
            case 10:
                j jVar16 = this.l;
                if (jVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar16 = null;
                }
                AddressField addressField7 = AddressField.CITY;
                r rVar13 = this.f8936k;
                if (rVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar2 = rVar13;
                }
                jVar16.m(addressField, E(addressField7, rVar2.f35097i));
                break;
            case 11:
                j jVar17 = this.l;
                if (jVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                    jVar17 = null;
                }
                AddressField addressField8 = AddressField.POSTAL_CODE;
                r rVar14 = this.f8936k;
                if (rVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar14;
                }
                jVar17.m(addressField, E(addressField8, rVar.C));
                break;
            case 12:
                j jVar18 = this.l;
                if (jVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar3 = jVar18;
                }
                jVar3.m(addressField, true);
                break;
            case 13:
                j jVar19 = this.l;
                if (jVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
                } else {
                    jVar2 = jVar19;
                }
                jVar2.m(addressField, I());
                break;
        }
    }

    public final void t(AddressField addressField, EditText editText) {
        editText.addTextChangedListener(new g0(addressField, this));
    }

    public final String u() {
        r rVar = this.f8936k;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rVar = null;
        }
        String etText = rVar.l.getEtText();
        j jVar = this.l;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar = null;
        }
        if (!jVar.k(AddressField.DELIVERY_ACCESS_CODE) || etText.length() <= 0) {
            return null;
        }
        return etText;
    }

    public final String v(AddressField addressField, AddressEditText addressEditText) {
        j jVar = this.l;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar = null;
        }
        if (jVar.k(addressField)) {
            return addressEditText.getEtText();
        }
        return null;
    }

    public final boolean w() {
        j jVar = this.l;
        r rVar = null;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
            jVar = null;
        }
        if (!jVar.k(AddressField.DELIVERY_NO_ACCESS_CODE)) {
            return false;
        }
        r rVar2 = this.f8936k;
        if (rVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rVar = rVar2;
        }
        return rVar.f35102o.isChecked();
    }

    public final e0 x() {
        return (e0) this.f8932g.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String y(AddressField addressField) {
        jg.a aVar;
        Object next;
        switch (jg.e0.$EnumSwitchMapping$0[addressField.ordinal()]) {
            case 1:
                UserAddress userAddress = this.f8938n;
                if (userAddress != null) {
                    return userAddress.getName();
                }
                return null;
            case 2:
                UserAddress userAddress2 = this.f8938n;
                if (userAddress2 != null) {
                    return userAddress2.getEmail();
                }
                return null;
            case 3:
                UserAddress userAddress3 = this.f8938n;
                if (userAddress3 != null) {
                    return userAddress3.getPhone();
                }
                return null;
            case 4:
                UserAddress userAddress4 = this.f8938n;
                if (userAddress4 != null) {
                    return userAddress4.getPhoneCountryCode();
                }
                return null;
            case 5:
                UserAddress userAddress5 = this.f8938n;
                if (userAddress5 != null) {
                    return userAddress5.getAddress1();
                }
                return null;
            case 6:
                UserAddress userAddress6 = this.f8938n;
                if (userAddress6 != null) {
                    return userAddress6.getAddress2();
                }
                return null;
            case 7:
                UserAddress userAddress7 = this.f8938n;
                if (userAddress7 != null) {
                    return userAddress7.getStreetName();
                }
                return null;
            case 8:
                UserAddress userAddress8 = this.f8938n;
                if (userAddress8 != null) {
                    return userAddress8.getHouseNumber();
                }
                return null;
            case 9:
                UserAddress userAddress9 = this.f8938n;
                if (userAddress9 != null) {
                    return userAddress9.getHouseNumberAddition();
                }
                return null;
            case 10:
                UserAddress userAddress10 = this.f8938n;
                if (userAddress10 != null) {
                    return userAddress10.getCity();
                }
                return null;
            case 11:
                UserAddress userAddress11 = this.f8938n;
                if (userAddress11 != null) {
                    return userAddress11.getPostalCode();
                }
                return null;
            case 12:
                UserAddress userAddress12 = this.f8938n;
                if (userAddress12 != null) {
                    return userAddress12.getPhoneCountryCode();
                }
                return null;
            case 13:
                Object obj = jg.b.f25162a;
                List listA = jg.b.a(this.f8935j);
                if (listA != null) {
                    Iterator it = listA.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            String str = ((jg.a) next).f25141a;
                            UserAddress userAddress13 = this.f8938n;
                            if (Intrinsics.areEqual(str, userAddress13 != null ? userAddress13.getState() : null)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    aVar = (jg.a) next;
                } else {
                    aVar = null;
                }
                return (aVar != null ? aVar.f25142b : null) + " (" + (aVar != null ? aVar.f25141a : null) + ")";
            default:
                return null;
        }
    }

    public final w0 z() {
        return (w0) this.f8937m.getValue();
    }
}
