package com.app.tgtg.feature.tabprofile.manageaccount.contactus;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bg.d0;
import bg.k0;
import bg.w0;
import br.i;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.autorefund.AutoRefundActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.support.RefundType;
import com.app.tgtg.model.remote.support.response.ConsumerRefundChoiceRequest;
import com.app.tgtg.model.remote.support.response.ConsumerSupportResponse;
import com.google.android.material.bottomsheet.l;
import e70.c;
import j4.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import mr.e;
import mv.d;
import mv.r0;
import pg.b1;
import pg.w;
import qs.a;
import sr.b;
import sr.f;
import sr.n;
import sr.q;
import u70.t;
import v80.f0;
import wr.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ContactUsActivity extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f9367t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f9369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k0 f9371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f9372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f9373k;
    public i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f9374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f9375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w0 f9376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActivityResultLauncher f9377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ActivityResultLauncher f9378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f9379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f9380s;

    public ContactUsActivity() {
        super(2);
        this.f9370h = new n1(Reflection.getOrCreateKotlinClass(ContactUsViewModel.class), new n(this, 1), new n(this, 0), new n(this, 2));
        this.f9375n = u70.l.b(new b(this, 1));
        final int i11 = 0;
        this.f9377p = registerForActivityResult(new g1(4), new ActivityResultCallback(this) { // from class: sr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactUsActivity f39096b;

            {
                this.f39096b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Uri data;
                int i12 = i11;
                ContactUsActivity contactUsActivity = this.f39096b;
                h.a aVar = (h.a) obj;
                switch (i12) {
                    case 0:
                        int i13 = ContactUsActivity.f9367t;
                        aVar.getClass();
                        if (aVar.f20935a == -1) {
                            Intent intent = aVar.f20936b;
                            if (intent == null || intent.getData() == null) {
                                data = contactUsActivity.f9380s;
                            } else {
                                data = intent.getData();
                                data.getClass();
                            }
                            if (data != null) {
                                contactUsActivity.F().f9393n.add(data);
                                pg.w wVar = null;
                                View viewInflate = View.inflate(contactUsActivity, R.layout.contact_us_attachment_view, null);
                                ((ImageView) viewInflate.findViewById(R.id.ivImage)).setImageURI(data);
                                pg.w wVar2 = contactUsActivity.f9369g;
                                if (wVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    wVar2 = null;
                                }
                                int childCount = wVar2.l.getChildCount() - 1;
                                pg.w wVar3 = contactUsActivity.f9369g;
                                if (wVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    wVar3 = null;
                                }
                                wVar3.l.addView(viewInflate, childCount);
                                mv.d.x(viewInflate, new ry.b(3, contactUsActivity, viewInflate));
                                boolean z11 = contactUsActivity.F().f9393n.size() < 2;
                                pg.w wVar4 = contactUsActivity.f9369g;
                                if (wVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    wVar = wVar4;
                                }
                                ContactUsActivity.Z(z11, wVar.f35213h);
                            } else {
                                Toast.makeText(contactUsActivity, R.string.generic_err_undefined_error, 0).show();
                            }
                        }
                        break;
                    default:
                        int i14 = ContactUsActivity.f9367t;
                        aVar.getClass();
                        if (aVar.f20935a == 1002 && !contactUsActivity.isFinishing() && !contactUsActivity.isDestroyed()) {
                            contactUsActivity.setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
                            contactUsActivity.F().f9389i = true;
                            contactUsActivity.getOnBackPressedDispatcher().d();
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        this.f9378q = registerForActivityResult(new g1(4), new ActivityResultCallback(this) { // from class: sr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactUsActivity f39096b;

            {
                this.f39096b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Uri data;
                int i122 = i12;
                ContactUsActivity contactUsActivity = this.f39096b;
                h.a aVar = (h.a) obj;
                switch (i122) {
                    case 0:
                        int i13 = ContactUsActivity.f9367t;
                        aVar.getClass();
                        if (aVar.f20935a == -1) {
                            Intent intent = aVar.f20936b;
                            if (intent == null || intent.getData() == null) {
                                data = contactUsActivity.f9380s;
                            } else {
                                data = intent.getData();
                                data.getClass();
                            }
                            if (data != null) {
                                contactUsActivity.F().f9393n.add(data);
                                pg.w wVar = null;
                                View viewInflate = View.inflate(contactUsActivity, R.layout.contact_us_attachment_view, null);
                                ((ImageView) viewInflate.findViewById(R.id.ivImage)).setImageURI(data);
                                pg.w wVar2 = contactUsActivity.f9369g;
                                if (wVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    wVar2 = null;
                                }
                                int childCount = wVar2.l.getChildCount() - 1;
                                pg.w wVar3 = contactUsActivity.f9369g;
                                if (wVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    wVar3 = null;
                                }
                                wVar3.l.addView(viewInflate, childCount);
                                mv.d.x(viewInflate, new ry.b(3, contactUsActivity, viewInflate));
                                boolean z11 = contactUsActivity.F().f9393n.size() < 2;
                                pg.w wVar4 = contactUsActivity.f9369g;
                                if (wVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    wVar = wVar4;
                                }
                                ContactUsActivity.Z(z11, wVar.f35213h);
                            } else {
                                Toast.makeText(contactUsActivity, R.string.generic_err_undefined_error, 0).show();
                            }
                        }
                        break;
                    default:
                        int i14 = ContactUsActivity.f9367t;
                        aVar.getClass();
                        if (aVar.f20935a == 1002 && !contactUsActivity.isFinishing() && !contactUsActivity.isDestroyed()) {
                            contactUsActivity.setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
                            contactUsActivity.F().f9389i = true;
                            contactUsActivity.getOnBackPressedDispatcher().d();
                            break;
                        }
                        break;
                }
            }
        });
        this.f9379r = new e(this, 7);
    }

    public static void Z(boolean z11, View... viewArr) {
        for (View view : viewArr) {
            p30.b.E(view, z11);
        }
    }

    public final void C() {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35212g.animate().setDuration(100L).alpha(1.0f).start();
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar3;
        }
        wVar2.f35211f.animate().setDuration(100L).alpha(1.0f).start();
    }

    public final void D(boolean z11) {
        w wVar = this.f9369g;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        Button button = wVar.f35207b;
        if (!F().g() || this.f9371i == null) {
            button.setEnabled(z11);
            button.setClickable(z11);
        } else {
            button.setEnabled(false);
            button.setClickable(false);
        }
    }

    public final void E() {
        setResult(AppConstants.RESULT_CODE_SUPPORT_MSG_SENT);
        r0.p(this);
        getOnBackPressedDispatcher().d();
    }

    public final ContactUsViewModel F() {
        return (ContactUsViewModel) this.f9370h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void G(ConsumerSupportResponse consumerSupportResponse) {
        f fVar;
        ContactUsViewModel contactUsViewModelF = F();
        cv.b bVar = contactUsViewModelF.f9384d;
        g gVarD = contactUsViewModelF.d();
        Object[] objArr = 0;
        if (gVarD != null) {
            cv.i iVar = cv.i.BRAZE_ACTION_CX_TICKET_SUBMITTED;
            dv.a aVar = dv.a.REASON;
            wr.b bVar2 = contactUsViewModelF.f9391k;
            Pair pair = new Pair(aVar, new dv.c(bVar2 != null ? bVar2.name() : null));
            dv.a aVar2 = dv.a.TOPIC;
            wr.e eVar = contactUsViewModelF.l;
            bVar.c(iVar, h0.g.E(pair, new Pair(aVar2, new dv.c(eVar != null ? eVar.name() : null))));
            cv.i iVar2 = cv.i.ACTION_CONTACT_COMPLETED;
            Pair pair2 = new Pair(dv.a.SOURCE, new dv.c(Intrinsics.areEqual(gVarD.f43530h, "order") ? "Order" : "More_Menu"));
            wr.b bVar3 = contactUsViewModelF.f9391k;
            Pair pair3 = new Pair(aVar, new dv.c(bVar3 != null ? bVar3.name() : null));
            wr.e eVar2 = contactUsViewModelF.l;
            bVar.c(iVar2, h0.g.E(pair2, pair3, new Pair(aVar2, new dv.c(eVar2 != null ? eVar2.name() : null)), new Pair(dv.a.ATTACHMENT, new dv.c(Boolean.valueOf(!contactUsViewModelF.f9393n.isEmpty())))));
        }
        String[] supportedRefundingTypes = consumerSupportResponse.getSupportedRefundingTypes();
        Integer numValueOf = supportedRefundingTypes != null ? Integer.valueOf(supportedRefundingTypes.length) : null;
        if (numValueOf == null || numValueOf.intValue() == 0) {
            if (F().f9391k == wr.b.BAD_ORDER_EXPERIENCE || F().f9391k == wr.b.DELIVERY_ISSUE) {
                fVar = f.EMAIL_CONFIRMED;
            } else {
                wr.e eVar3 = F().l;
                wr.e eVar4 = wr.e.APP_ERROR;
                fVar = eVar3 == eVar4 ? f.EMAIL_CONFIRMED : (F().l == wr.e.GENERIC_QUESTION && F().l == eVar4) ? f.THANKS_FOR_INPUT : f.THANKS_FOR_INPUT;
            }
            d0(fVar);
        } else {
            String[] supportedRefundingTypes2 = consumerSupportResponse.getSupportedRefundingTypes();
            supportedRefundingTypes2.getClass();
            if (y.v(supportedRefundingTypes2, "ORIGINAL_PAYMENT")) {
                Intent intent = new Intent(this, (Class<?>) AutoRefundActivity.class);
                intent.putExtra("SUPPORT_TICKET_RESPONSE", consumerSupportResponse);
                BriefOrder briefOrder = F().f9392m;
                String strM321getOrderIdreIZeYA = briefOrder != null ? briefOrder.m321getOrderIdreIZeYA() : null;
                intent.putExtra("ORDER_ID", strM321getOrderIdreIZeYA != null ? OrderId.m209boximpl(strM321getOrderIdreIZeYA) : null);
                this.f9378q.a(intent, new se.b(ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_from_bottom_to_top, R.anim.stay), 5));
            } else {
                ContactUsViewModel contactUsViewModelF2 = F();
                ConsumerRefundChoiceRequest consumerRefundChoiceRequest = new ConsumerRefundChoiceRequest(consumerSupportResponse.getRefundingUuid(), RefundType.REFUSE_REFUND);
                contactUsViewModelF2.getClass();
                f0.B(m1.d(contactUsViewModelF2), null, null, new mn.g(contactUsViewModelF2, consumerRefundChoiceRequest, objArr == true ? 1 : 0, 27), 3);
            }
        }
        I();
    }

    public final void H() {
        l lVar = this.f9374m;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            lVar = null;
        }
        lVar.cancel();
    }

    public final void I() {
        F().f9390j = false;
        w0 w0Var = this.f9376o;
        if (w0Var != null) {
            w0Var.a();
        }
    }

    public final void J(wr.b bVar, boolean z11) throws Exception {
        bVar.getClass();
        if (F().f9391k != bVar) {
            L(wr.e.NO_SELECTION);
        }
        F().f9391k = bVar;
        S(bVar);
        H();
        wr.e[] eVarArrF = bVar.f();
        if (eVarArrF != null) {
            wr.e[] eVarArr = (wr.e[]) Arrays.copyOf(eVarArrF, eVarArrF.length);
            this.f9373k = new i(this, this, (t40.b[]) Arrays.copyOf(eVarArr, eVarArr.length));
        }
        boolean z12 = (eVarArrF == null || eVarArrF.length == 0) ? false : true;
        boolean z13 = bVar != wr.b.NO_SELECTION;
        Y(z12);
        w wVar = null;
        F().l = null;
        if (z11) {
            F().f9392m = null;
        }
        if (!z12) {
            N(bVar.a());
            g gVarD = F().d();
            if (gVarD != null && !gVarD.f43529g) {
                F().f9392m = V(bVar.c(), false);
            }
            W(z13);
            R(z13);
            if (z13) {
                F().f9394o = true;
            }
            UserData userDataM = F().f9386f.m();
            ContactUsViewModel contactUsViewModelF = F();
            StringsKt.H(userDataM.getName());
            contactUsViewModelF.getClass();
        }
        F().f9393n.clear();
        w wVar2 = this.f9369g;
        if (wVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar2 = null;
        }
        LinearLayout linearLayout = wVar2.l;
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar = wVar3;
        }
        linearLayout.removeViews(0, wVar.l.getChildCount() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Type inference failed for: r6v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(boolean r10) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity.K(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(wr.e r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity.L(wr.e):void");
    }

    public final void M() {
        Uri uriForFile;
        Intent intentCreateChooser;
        if (Build.VERSION.SDK_INT >= 33) {
            if (androidx.core.app.e.a(this, "android.permission.CAMERA") == -1) {
                androidx.core.app.e.k(this, new String[]{"android.permission.CAMERA"}, 12345);
                return;
            }
        } else if (androidx.core.app.e.a(this, "android.permission.CAMERA") == -1 || androidx.core.app.e.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            androidx.core.app.e.k(this, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, 12345);
            return;
        }
        this.f9380s = null;
        File externalFilesDir = getExternalFilesDir("");
        if (externalFilesDir != null) {
            uriForFile = FileProvider.getUriForFile(this, getApplicationContext().getPackageName(), new File(externalFilesDir.getPath(), s.f(f9367t, "capturedImage_")));
            f9367t++;
        } else {
            uriForFile = null;
        }
        this.f9380s = uriForFile;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = getPackageManager();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (uriForFile != null) {
                intent2.putExtra("output", uriForFile);
            }
            arrayList.add(intent2);
        }
        Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
        intent3.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent3, 0);
        listQueryIntentActivities2.getClass();
        for (ResolveInfo resolveInfo2 : listQueryIntentActivities2) {
            Intent intent4 = new Intent(intent3);
            ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
            intent4.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
            intent4.setPackage(resolveInfo2.activityInfo.packageName);
            arrayList.add(intent4);
        }
        if (arrayList.isEmpty()) {
            intentCreateChooser = null;
        } else {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            Intent intent5 = (Intent) obj;
            Iterator it = arrayList.iterator();
            it.getClass();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                next.getClass();
                Intent intent6 = (Intent) next;
                if (intent6.getComponent() != null) {
                    ComponentName component = intent6.getComponent();
                    component.getClass();
                    if (Intrinsics.areEqual(component.getClassName(), "com.android.documentsui.DocumentsActivity")) {
                        intent5 = intent6;
                        break;
                    }
                }
            }
            arrayList.remove(intent5);
            intentCreateChooser = Intent.createChooser(intent5, getString(R.string.contact_us_browse_files_dialog_title));
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        }
        if (intentCreateChooser != null) {
            this.f9377p.a(intentCreateChooser, null);
        }
    }

    public final void N(boolean z11) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        TextView textView = wVar.f35222r;
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar3;
        }
        Z(z11, textView, wVar2.l);
    }

    public final void O(TextView textView, boolean z11) {
        textView.setTextColor(getApplicationContext().getColor(z11 ? R.color.neutral_40 : R.color.neutral_80));
    }

    public final void P(int i11) {
        w wVar = this.f9369g;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35211f.setText(getString(i11));
    }

    public final void Q(int i11) {
        w wVar = this.f9369g;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35212g.setText(getString(i11));
    }

    public final void R(boolean z11) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        EditText editText = wVar.f35209d;
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar3;
        }
        Z(z11, editText, wVar2.f35224t);
        c0(false);
    }

    public final void S(wr.b bVar) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35228x.setText(bVar.d().intValue());
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar3;
        }
        O(wVar2.f35228x, bVar == wr.b.NO_SELECTION);
    }

    public final void T() {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        TextView textView = wVar.f35225u;
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar3 = null;
        }
        TextView textView2 = wVar3.f35228x;
        w wVar4 = this.f9369g;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar4;
        }
        Z(false, textView, textView2, wVar2.f35214i);
    }

    public final void U(BriefOrder briefOrder) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35217m.removeAllViews();
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar3;
        }
        LinearLayout linearLayout = wVar2.f35217m;
        briefOrder.getClass();
        sr.i iVar = new sr.i(this, this);
        iVar.j(briefOrder, false);
        linearLayout.addView(iVar);
    }

    public final BriefOrder V(boolean z11, boolean z12) {
        BriefOrder[] briefOrderArr;
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        TextView textView = wVar.f35226v;
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar3 = null;
        }
        LinearLayout linearLayout = wVar3.f35217m;
        w wVar4 = this.f9369g;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar4 = null;
        }
        Z(z11, textView, linearLayout, wVar4.f35215j);
        if (z11) {
            w wVar5 = this.f9369g;
            if (wVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wVar5 = null;
            }
            if (wVar5.f35217m.getChildCount() == 0) {
                i iVar = this.l;
                Integer numValueOf = (iVar == null || (briefOrderArr = (BriefOrder[]) iVar.f6629c) == null) ? null : Integer.valueOf(briefOrderArr.length);
                numValueOf.getClass();
                if (numValueOf.intValue() > 0) {
                    i iVar2 = this.l;
                    iVar2.getClass();
                    BriefOrder briefOrder = ((BriefOrder[]) iVar2.f6629c)[0];
                    U(briefOrder);
                    if (z12) {
                        w wVar6 = this.f9369g;
                        if (wVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            wVar6 = null;
                        }
                        View childAt = wVar6.f35217m.getChildAt(0);
                        childAt.getClass();
                        ((sr.i) childAt).setInactive();
                        w wVar7 = this.f9369g;
                        if (wVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            wVar7 = null;
                        }
                        wVar7.f35217m.setOnClickListener(null);
                        w wVar8 = this.f9369g;
                        if (wVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            wVar2 = wVar8;
                        }
                        wVar2.f35215j.setVisibility(4);
                    }
                    return briefOrder;
                }
            }
        }
        return null;
    }

    public final void W(boolean z11) {
        w wVar = null;
        if (!F().g() || this.f9371i == null) {
            w wVar2 = this.f9369g;
            if (wVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wVar = wVar2;
            }
            wVar.f35207b.setEnabled(z11);
            return;
        }
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar = wVar3;
        }
        wVar.f35207b.setEnabled(false);
    }

    public final void X(wr.e eVar) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35229y.setText(eVar.a().intValue());
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar3;
        }
        O(wVar2.f35229y, eVar == wr.e.NO_SELECTION);
    }

    public final void Y(boolean z11) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        TextView textView = wVar.f35227w;
        w wVar3 = this.f9369g;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar3 = null;
        }
        TextView textView2 = wVar3.f35229y;
        w wVar4 = this.f9369g;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wVar2 = wVar4;
        }
        Z(z11, textView, textView2, wVar2.f35216k);
    }

    public final void a0(int i11, sr.e eVar) {
        i iVar;
        WindowManager.LayoutParams attributes;
        LayoutInflater layoutInflater = getLayoutInflater();
        w wVar = this.f9369g;
        l lVar = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.contact_us_bottom_sheet, (ViewGroup) wVar.f35218n, false);
        int i12 = R.id.ivClose;
        ImageView imageView = (ImageView) pd.g.t(R.id.ivClose, viewInflate);
        if (imageView != null) {
            i12 = R.id.rvBottomSheetItems;
            RecyclerView recyclerView = (RecyclerView) pd.g.t(R.id.rvBottomSheetItems, viewInflate);
            if (recyclerView != null) {
                i12 = R.id.tvSheetTitle;
                TextView textView = (TextView) pd.g.t(R.id.tvSheetTitle, viewInflate);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    textView.setText(i11);
                    d.x(imageView, new sr.a(this, 6));
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                    int i13 = sr.l.$EnumSwitchMapping$1[eVar.ordinal()];
                    if (i13 == 1) {
                        iVar = this.f9372j;
                    } else if (i13 == 2) {
                        iVar = this.f9373k;
                    } else {
                        if (i13 != 3) {
                            e40.a.f();
                            return;
                        }
                        iVar = this.l;
                    }
                    recyclerView.setAdapter(iVar);
                    Context context = recyclerView.getContext();
                    context.getClass();
                    int iA = d70.b.a(16);
                    d0 d0Var = new d0();
                    d0Var.f6141a = iA;
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.listDivider});
                    typedArrayObtainStyledAttributes.getClass();
                    Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                    drawable.getClass();
                    d0Var.f6142b = drawable;
                    typedArrayObtainStyledAttributes.recycle();
                    recyclerView.i(d0Var);
                    if (eVar == sr.e.ORDER) {
                        ViewCompat.k0(recyclerView, new qc.y(9));
                    }
                    l lVar2 = this.f9374m;
                    if (lVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        lVar = lVar2;
                    }
                    lVar.setContentView(constraintLayout);
                    Window window = lVar.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        attributes.windowAnimations = R.style.DialogAnimation;
                    }
                    lVar.show();
                    return;
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    public final void b0() {
        if (this.f9376o == null) {
            this.f9376o = new w0(this);
        }
        F().f9390j = true;
        w0 w0Var = this.f9376o;
        w0Var.getClass();
        w wVar = this.f9369g;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        w0Var.b(wVar.f35218n);
    }

    public final void c0(boolean z11) {
        w wVar = this.f9369g;
        w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wVar = null;
        }
        wVar.f35223s.setVisibility(z11 ? 0 : 8);
        if (z11) {
            w wVar3 = this.f9369g;
            if (wVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wVar3 = null;
            }
            ScrollView scrollView = wVar3.f35219o;
            w wVar4 = this.f9369g;
            if (wVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wVar4 = null;
            }
            TextView textView = wVar4.f35223s;
            w wVar5 = this.f9369g;
            if (wVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                wVar2 = wVar5;
            }
            scrollView.requestChildFocus(textView, wVar2.f35223s);
        }
    }

    public final void d0(f fVar) {
        t tVar = this.f9375n;
        q qVar = (q) tVar.getValue();
        sr.d dVar = new sr.d(this, 1);
        qVar.getClass();
        qVar.f39113b = dVar;
        ((q) tVar.getValue()).a(fVar);
    }

    public final void e0() {
        ContactUsViewModel contactUsViewModelF = F();
        cv.i iVar = cv.i.SCREEN_CONTACT_VERIFY_EMAIL;
        contactUsViewModelF.getClass();
        iVar.getClass();
        contactUsViewModelF.f9384d.b(iVar);
        if (this.f9371i == null) {
            k0 k0Var = new k0(this);
            k0Var.f6186r = "letter_blob.json";
            k0Var.f6185q = d70.b.a(100);
            k0Var.f6179j = false;
            k0Var.f6180k = true;
            k0Var.e(R.string.contact_us_unverified_email_popup_title);
            k0Var.a(R.string.contact_us_unverified_email_popup_description);
            k0Var.c(R.string.contact_us_unverified_email_popup_button);
            k0Var.l = new b(this, 0);
            this.f9371i = k0Var;
        }
        k0 k0Var2 = this.f9371i;
        if (k0Var2 != null) {
            k0Var2.f();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (F().f9390j) {
            if (this.f9376o == null) {
                this.f9376o = new w0(this);
            }
            w0 w0Var = this.f9376o;
            w0Var.getClass();
            w wVar = this.f9369g;
            if (wVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wVar = null;
            }
            w0Var.b(wVar.f35218n);
        }
        if (F().g()) {
            e0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qs.a, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        Object[] objArr = 0;
        int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.contact_us_view, (ViewGroup) null, false);
        int i12 = R.id.btnSubmit;
        Button button = (Button) pd.g.t(R.id.btnSubmit, viewInflate);
        if (button != null) {
            i12 = R.id.curlyArrow;
            ImageView imageView = (ImageView) pd.g.t(R.id.curlyArrow, viewInflate);
            if (imageView != null) {
                i12 = R.id.etMessage;
                EditText editText = (EditText) pd.g.t(R.id.etMessage, viewInflate);
                if (editText != null) {
                    i12 = R.id.foodDateLabelInfoLayout;
                    LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.foodDateLabelInfoLayout, viewInflate);
                    if (linearLayout != null) {
                        i12 = R.id.helperBox;
                        if (((LinearLayout) pd.g.t(R.id.helperBox, viewInflate)) != null) {
                            i12 = R.id.helperBoxDescription;
                            TextView textView = (TextView) pd.g.t(R.id.helperBoxDescription, viewInflate);
                            if (textView != null) {
                                i12 = R.id.helperBoxTitle;
                                TextView textView2 = (TextView) pd.g.t(R.id.helperBoxTitle, viewInflate);
                                if (textView2 != null) {
                                    i12 = R.id.ivPickImage;
                                    ImageView imageView2 = (ImageView) pd.g.t(R.id.ivPickImage, viewInflate);
                                    if (imageView2 != null) {
                                        i12 = R.id.ivSelectedReasonArrow;
                                        ImageView imageView3 = (ImageView) pd.g.t(R.id.ivSelectedReasonArrow, viewInflate);
                                        if (imageView3 != null) {
                                            i12 = R.id.ivSelectedReceiptArrow;
                                            ImageView imageView4 = (ImageView) pd.g.t(R.id.ivSelectedReceiptArrow, viewInflate);
                                            if (imageView4 != null) {
                                                i12 = R.id.ivSelectedTopicArrow;
                                                ImageView imageView5 = (ImageView) pd.g.t(R.id.ivSelectedTopicArrow, viewInflate);
                                                if (imageView5 != null) {
                                                    i12 = R.id.llAttachments;
                                                    LinearLayout linearLayout2 = (LinearLayout) pd.g.t(R.id.llAttachments, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i12 = R.id.llSelectedReceipt;
                                                        LinearLayout linearLayout3 = (LinearLayout) pd.g.t(R.id.llSelectedReceipt, viewInflate);
                                                        if (linearLayout3 != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            i12 = R.id.scroller;
                                                            ScrollView scrollView = (ScrollView) pd.g.t(R.id.scroller, viewInflate);
                                                            if (scrollView != null) {
                                                                i12 = R.id.sorryLayout;
                                                                LinearLayout linearLayout4 = (LinearLayout) pd.g.t(R.id.sorryLayout, viewInflate);
                                                                if (linearLayout4 != null) {
                                                                    i12 = R.id.toolbar;
                                                                    View viewT = pd.g.t(R.id.toolbar, viewInflate);
                                                                    if (viewT != null) {
                                                                        b1 b1VarB = b1.b(viewT);
                                                                        i12 = R.id.tvAttachmentsTitle;
                                                                        TextView textView3 = (TextView) pd.g.t(R.id.tvAttachmentsTitle, viewInflate);
                                                                        if (textView3 != null) {
                                                                            i12 = R.id.tvMessageError;
                                                                            TextView textView4 = (TextView) pd.g.t(R.id.tvMessageError, viewInflate);
                                                                            if (textView4 != null) {
                                                                                i12 = R.id.tvMessageTitle;
                                                                                TextView textView5 = (TextView) pd.g.t(R.id.tvMessageTitle, viewInflate);
                                                                                if (textView5 != null) {
                                                                                    i12 = R.id.tvSelectReasonTitle;
                                                                                    TextView textView6 = (TextView) pd.g.t(R.id.tvSelectReasonTitle, viewInflate);
                                                                                    if (textView6 != null) {
                                                                                        i12 = R.id.tvSelectReceiptTitle;
                                                                                        TextView textView7 = (TextView) pd.g.t(R.id.tvSelectReceiptTitle, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i12 = R.id.tvSelectTopicTitle;
                                                                                            TextView textView8 = (TextView) pd.g.t(R.id.tvSelectTopicTitle, viewInflate);
                                                                                            if (textView8 != null) {
                                                                                                i12 = R.id.tvSelectedReason;
                                                                                                TextView textView9 = (TextView) pd.g.t(R.id.tvSelectedReason, viewInflate);
                                                                                                if (textView9 != null) {
                                                                                                    i12 = R.id.tvSelectedTopic;
                                                                                                    TextView textView10 = (TextView) pd.g.t(R.id.tvSelectedTopic, viewInflate);
                                                                                                    if (textView10 != null) {
                                                                                                        this.f9369g = new w(constraintLayout, button, imageView, editText, linearLayout, textView, textView2, imageView2, imageView3, imageView4, imageView5, linearLayout2, linearLayout3, constraintLayout, scrollView, linearLayout4, b1VarB, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
                                                                                                        setContentView(constraintLayout);
                                                                                                        getOnBackPressedDispatcher().a(this.f9379r);
                                                                                                        this.f9374m = new l(this, R.style.AppBottomSheetDialogTheme);
                                                                                                        c cVar = this.f9368f;
                                                                                                        if (cVar == null) {
                                                                                                            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
                                                                                                            cVar = null;
                                                                                                        }
                                                                                                        c.b(cVar, this, null, 6);
                                                                                                        int i13 = 5;
                                                                                                        F().e().e(this, new dk.b(new sr.a(this, 12), 5));
                                                                                                        F().c().e(this, new dk.b(new sr.a(this, 13), 5));
                                                                                                        ((av.e) F().f9398s.getValue()).e(this, new dk.b(new sr.a(this, 14), 5));
                                                                                                        ((av.e) F().f9397r.getValue()).e(this, new dk.b(new sr.a(this, 15), 5));
                                                                                                        int i14 = 1;
                                                                                                        ((av.e) F().f9399t.getValue()).e(this, new dk.b(new sr.a(this, i14), 5));
                                                                                                        ((av.e) F().f9401v.getValue()).e(this, new dk.b(new sr.a(this, 2), 5));
                                                                                                        ((av.e) F().f9400u.getValue()).e(this, new dk.b(new sr.a(this, 3), 5));
                                                                                                        F().f9402w.e(this, new dk.b(new sr.a(this, 4), 5));
                                                                                                        o30.f0.S(this, true);
                                                                                                        g gVarD = F().d();
                                                                                                        if (gVarD != null) {
                                                                                                            w wVar = this.f9369g;
                                                                                                            if (wVar == null) {
                                                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                                                wVar = null;
                                                                                                            }
                                                                                                            ((TextView) wVar.f35221q.f34795c).setText(R.string.contact_us_toolbar_title);
                                                                                                            w wVar2 = this.f9369g;
                                                                                                            if (wVar2 == null) {
                                                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                                                wVar2 = null;
                                                                                                            }
                                                                                                            wVar2.f35225u.setText(R.string.contact_us_reason_spinner_title);
                                                                                                            w wVar3 = this.f9369g;
                                                                                                            if (wVar3 == null) {
                                                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                                                wVar3 = null;
                                                                                                            }
                                                                                                            wVar3.f35227w.setText(R.string.contact_us_topic_spinner_title);
                                                                                                            Y(false);
                                                                                                            V(false, false);
                                                                                                            R(false);
                                                                                                            N(false);
                                                                                                            wr.b bVar = gVarD.f43524b;
                                                                                                            boolean z11 = gVarD.f43525c;
                                                                                                            if (bVar != null && bVar == wr.b.CONSUMER_GENERAL_QUESTION) {
                                                                                                                I();
                                                                                                                Q(R.string.contact_us_helper_box_general_title);
                                                                                                                P(R.string.contact_us_helper_box_general_description);
                                                                                                                C();
                                                                                                                wr.b bVar2 = gVarD.f43524b;
                                                                                                                if (bVar2 != null) {
                                                                                                                    J(bVar2, true);
                                                                                                                    S(bVar2);
                                                                                                                    if (z11) {
                                                                                                                        T();
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if (bVar == null || bVar != wr.b.STORE_SUGGESTION) {
                                                                                                                Q(R.string.contact_us_helper_box_order_title);
                                                                                                                P(R.string.contact_us_helper_box_order_description);
                                                                                                                ContactUsViewModel contactUsViewModelF = F();
                                                                                                                contactUsViewModelF.getClass();
                                                                                                                f0.B(m1.d(contactUsViewModelF), null, null, new sf.a(contactUsViewModelF, objArr == true ? 1 : 0, i14), 3);
                                                                                                            } else {
                                                                                                                I();
                                                                                                                Q(R.string.contact_us_helper_box_suggest_a_store_title);
                                                                                                                P(R.string.contact_us_helper_box_suggest_a_store_description);
                                                                                                                C();
                                                                                                                wr.b bVar3 = gVarD.f43524b;
                                                                                                                if (bVar3 != null) {
                                                                                                                    J(bVar3, true);
                                                                                                                    S(bVar3);
                                                                                                                    if (z11) {
                                                                                                                        T();
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            w wVar4 = this.f9369g;
                                                                                                            if (wVar4 == null) {
                                                                                                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                                                                                wVar4 = null;
                                                                                                            }
                                                                                                            d.x(wVar4.f35229y, new sr.a(this, i11));
                                                                                                            d.x(wVar4.f35217m, new sr.a(this, i13));
                                                                                                            d.x(wVar4.f35213h, new sr.a(this, 7));
                                                                                                            d.x(wVar4.f35207b, new sr.a(this, 9));
                                                                                                            d.x((ImageButton) wVar4.f35221q.f34796d, new sr.a(this, 10));
                                                                                                            d.y(wVar4.f35209d, new sr.a(this, 11));
                                                                                                            ContactUsViewModel contactUsViewModelF2 = F();
                                                                                                            g gVarD2 = contactUsViewModelF2.d();
                                                                                                            if (gVarD2 != null) {
                                                                                                                cv.b bVar4 = contactUsViewModelF2.f9384d;
                                                                                                                cv.i iVar = cv.i.SCREEN_CONTACT;
                                                                                                                dv.a aVar = dv.a.SOURCE;
                                                                                                                String str = gVarD2.f43530h;
                                                                                                                Pair pair = new Pair(aVar, new dv.c(Intrinsics.areEqual(str, "order") ? "Order" : Intrinsics.areEqual(str, "Deeplink") ? "Deeplink" : "Help_Center"));
                                                                                                                dv.a aVar2 = dv.a.REASON;
                                                                                                                wr.b bVar5 = gVarD2.f43524b;
                                                                                                                Pair pair2 = new Pair(aVar2, new dv.c(bVar5 != null ? String.valueOf(bVar5) : wr.b.CONSUMER_GENERAL_QUESTION.toString()));
                                                                                                                dv.a aVar3 = dv.a.TOPIC;
                                                                                                                wr.e eVar = gVarD2.f43526d;
                                                                                                                bVar4.c(iVar, h0.g.E(pair, pair2, new Pair(aVar3, new dv.c(eVar != null ? String.valueOf(eVar) : null))));
                                                                                                                return;
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        return;
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
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // qs.a, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        I();
        super.onDestroy();
        this.f9379r.remove();
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr.length == 1 && iArr[0] == 0) {
            M();
        } else if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 0) {
            M();
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!F().g() || this.f9371i == null) {
            return;
        }
        e0();
    }
}
