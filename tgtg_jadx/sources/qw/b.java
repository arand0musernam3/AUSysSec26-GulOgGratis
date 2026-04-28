package qw;

import a40.q;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.work.impl.WorkDatabase;
import at.c0;
import com.app.tgtg.R;
import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.CountryBasedVoucher;
import com.app.tgtg.model.remote.voucher.CurrencyBasedVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import f0.f2;
import ii.j0;
import java.util.List;
import java.util.UUID;
import jb.j;
import jb.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m3.b1;
import ok.k0;
import ok.n;
import org.bouncycastle.iana.AEADAlgorithm;
import r2.l;
import sr.t;
import ss.a1;
import ss.h1;
import ss.w;
import ss.w0;
import ss.x;
import ss.x0;
import ts.b0;
import ts.m;
import v80.f0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37278c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f37276a = i11;
        this.f37277b = obj;
        this.f37278c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws PendingIntent.CanceledException {
        int i11 = this.f37276a;
        int i12 = 7;
        int i13 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f37278c;
        Object obj2 = this.f37277b;
        switch (i11) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((Ref.ObjectRef) obj2).element = ((Function0) obj).invoke();
                break;
            case 4:
                break;
            case 5:
                ((p2.d) obj2).f34133d.invoke((p2.g) obj);
                break;
            case 6:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    l.a(activity);
                } else {
                    activity.send();
                }
                break;
            case 7:
                s sVar = (s) obj2;
                WorkDatabase workDatabase = sVar.f24926c;
                workDatabase.getClass();
                workDatabase.p(new y.a(new mr.h(15, sVar, (UUID) obj), i12));
                j.b(sVar.f24925b, sVar.f24926c, sVar.f24928e);
                break;
            case 8:
                s sVar2 = (s) obj;
                WorkDatabase workDatabase2 = sVar2.f24926c;
                workDatabase2.getClass();
                workDatabase2.p(new y.a(new q(workDatabase2, (String) obj2, sVar2, 27), i12));
                j.b(sVar2.f24925b, workDatabase2, sVar2.f24928e);
                break;
            case 9:
                hr.i iVar = (hr.i) obj2;
                dv.b bVarE = h0.g.E(new Pair(dv.a.CATEGORY, new dv.c("account")), new Pair(dv.a.ITEM_TYPE, new dv.c("CHARITY")), new Pair(dv.a.SOURCE, new dv.c("Manage_Account")));
                cv.i iVar2 = cv.i.SCREEN_HELPCENTER_CATEGORY;
                iVar.getClass();
                iVar2.getClass();
                iVar.f22430b.c(iVar2, bVarE);
                ((j0) ((ub.a) obj).f40981b).f23922c.f44310a.a(new f70.b(CharityContactUsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                break;
            case 10:
                m1.a aVar = (m1.a) obj;
                aVar.getClass();
                ((m1) ((f2) aVar.f28697a).f16653f).i(new n(new k0((String) obj2)));
                break;
            case 11:
                ((w0) ((t5.a) obj2).f39791b).f39263c.i(ts.b.f40438a);
                ((Function0) obj).invoke();
                break;
            case 12:
                t5.a aVar2 = (t5.a) obj2;
                String str = (String) ((b1) obj).getValue();
                aVar2.getClass();
                str.getClass();
                ((w0) aVar2.f39791b).f39263c.i(new ts.a(str));
                break;
            case 13:
                ((w) ((t5.a) obj2).f39791b).f39256d.i(ts.n.f40457a);
                ((Function0) obj).invoke();
                break;
            case 14:
                t5.a aVar3 = (t5.a) obj2;
                String str2 = (String) ((b1) obj).getValue();
                aVar3.getClass();
                str2.getClass();
                ((w) aVar3.f39791b).f39256d.i(new m(str2));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                BasicVoucher basicVoucher = (BasicVoucher) obj;
                ((Function2) obj2).invoke(basicVoucher.getVoucherType(), VoucherId.m298boximpl(basicVoucher.mo529getIdVUJ7vw4()));
                break;
            case 16:
                ((Function1) obj2).invoke(VoucherId.m298boximpl(((DiscountVoucher) obj).mo529getIdVUJ7vw4()));
                break;
            case 17:
                ((Function1) obj2).invoke(VoucherId.m298boximpl(((CountryBasedVoucher) obj).mo529getIdVUJ7vw4()));
                break;
            case 18:
                ((Function1) obj2).invoke(VoucherId.m298boximpl(((CurrencyBasedVoucher) obj).mo529getIdVUJ7vw4()));
                break;
            case 19:
                ContactUsActivity contactUsActivity = (ContactUsActivity) obj;
                int i14 = ContactUsActivity.f9367t;
                contactUsActivity.b0();
                ContactUsViewModel contactUsViewModelF = contactUsActivity.F();
                contactUsViewModelF.getClass();
                f0.B(androidx.lifecycle.m1.d(contactUsViewModelF), null, null, new t(contactUsViewModelF, (String) obj2, objArr == true ? 1 : 0, i13), 3);
                break;
            case 20:
                break;
            case 21:
                ((x80.m) obj2).h(obj);
                break;
            case 22:
                ti.s sVar3 = (ti.s) obj;
                ((b1) obj2).setValue(Boolean.TRUE);
                cv.i iVar3 = cv.i.ACTION_MANAGE_CUSTOM_COLLECTION_DAYS;
                sVar3.getClass();
                iVar3.getClass();
                sVar3.f40263d.b(iVar3);
                break;
            case 23:
                ((Function1) obj2).invoke((List) obj);
                break;
            case 24:
                ((Function1) obj2).invoke((op.c) obj);
                break;
            case 25:
                break;
            case 26:
                tg.i iVar4 = (tg.i) obj2;
                Context context2 = (Context) obj;
                ft.j jVar = iVar4.f40164c;
                context2.getClass();
                if (androidx.core.app.e.a(context2, "android.permission.ACCESS_FINE_LOCATION") == 0 && jVar.i()) {
                    iVar4.g(sm.b.CLICKED);
                    jVar.e(true, new c1.q(iVar4, i12));
                } else if (androidx.core.app.e.a(context2, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    f0.B(androidx.lifecycle.m1.d(iVar4), null, null, new tg.f(iVar4, objArr2 == true ? 1 : 0, i13), 3);
                } else if (!jVar.i()) {
                    Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                    if (activity2 != null) {
                        jVar.c(activity2);
                    }
                }
                break;
            case 27:
                t5.a aVar4 = (t5.a) obj;
                String str3 = ((h1) obj2).f39186b;
                String str4 = (str3 == null || str3.length() <= 0) ? null : str3;
                if (str4 != null) {
                    aVar4.getClass();
                    c0.c((c0) aVar4.f39793d, str4, ct.a.TERMS_AND_CONDITIONS_USER_REFERRAL, Integer.valueOf(R.string.user_referral_invite_friend_faq_terms), false, 24);
                } else {
                    ((x0) aVar4.f39792c).f39269a.a(new b0());
                }
                break;
            case 28:
                t5.a aVar5 = (t5.a) obj;
                String str5 = ((a1) obj2).f39130b;
                String str6 = (str5 == null || str5.length() <= 0) ? null : str5;
                if (str6 != null) {
                    aVar5.getClass();
                    c0.c((c0) aVar5.f39793d, str6, ct.a.TERMS_AND_CONDITIONS_USER_REFERRAL, Integer.valueOf(R.string.user_referral_invite_friend_faq_terms), false, 24);
                } else {
                    ((x) aVar5.f39792c).f39268a.a(new b0());
                }
                break;
            default:
                t5.a aVar6 = (t5.a) obj;
                String termsLink = ((DiscountVoucher) obj2).getTermsLink();
                aVar6.getClass();
                termsLink.getClass();
                c0.c((c0) aVar6.f39793d, termsLink, ct.a.TERMS_AND_CONDITIONS, Integer.valueOf(R.string.webview_terms_and_condition_title), false, 24);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(Object obj, int i11, String str) {
        this.f37276a = i11;
        this.f37278c = obj;
        this.f37277b = str;
    }
}
