package m90;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import b5.q2;
import com.app.tgtg.R;
import com.app.tgtg.customview.FavoriteIconView;
import com.app.tgtg.feature.deeplink.DeepLinkActivity;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.login.terms.TermsConsentView;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import com.app.tgtg.model.remote.Country;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29895b;

    public /* synthetic */ z0(int i11, Object obj, Object obj2) {
        this.f29894a = i11;
        this.f29895b = obj;
    }

    /* JADX WARN: Type inference failed for: r15v168, types: [java.lang.Object, java.util.Collection] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i80.n nVar;
        String strConcat;
        StringBuilder sb2;
        int i11;
        int i12 = this.f29894a;
        f70.g gVar = null;
        Object obj2 = this.f29895b;
        switch (i12) {
            case 0:
                k90.a aVar = (k90.a) obj;
                aVar.getClass();
                List list = (List) ((i90.a) obj2).f23583c;
                list.getClass();
                aVar.f26203b = list;
                return Unit.f26487a;
            case 1:
                s1 s1Var = (s1) obj2;
                k90.a aVar2 = (k90.a) obj;
                aVar2.getClass();
                k90.a.a(aVar2, "first", s1Var.f29855a.getDescriptor());
                k90.a.a(aVar2, "second", s1Var.f29856b.getDescriptor());
                k90.a.a(aVar2, "third", s1Var.f29857c.getDescriptor());
                return Unit.f26487a;
            case 2:
                pg.p pVar = (pg.p) obj2;
                int i13 = EditDataActivity.f9359n;
                ((View) obj).getClass();
                ((EditText) pVar.f35048n).setText("+");
                ((EditText) pVar.f35047m).setText("");
                return Unit.f26487a;
            case 3:
                j30.g gVar2 = (j30.g) obj2;
                Object obj3 = ((LinkedHashMap) gVar2.f24503c).get(Reflection.getOrCreateKotlinClass(obj.getClass()));
                n9.c cVar = obj3 instanceof n9.c ? (n9.c) obj3 : null;
                ((LinkedHashMap) gVar2.f24504d).get(obj);
                return cVar != null ? new n9.e(obj, cVar.f30736b.invoke(obj), cVar.f30737c, cVar.f30738d) : (n9.e) ((Function1) gVar2.f24502b).invoke(obj);
            case 4:
                ((y3.b) obj2).f(obj);
                return Unit.f26487a;
            case 5:
                j30.g gVar3 = (j30.g) obj2;
                ((View) obj).getClass();
                BasicItem basicItem = (BasicItem) gVar3.f24502b;
                basicItem.setFavorite(!basicItem.getFavorite());
                FavoriteIconView favoriteIconView = ((pg.p1) gVar3.f24503c).f35063w;
                favoriteIconView.getClass();
                FavoriteIconView.setIsFavorite$default(favoriteIconView, basicItem.getFavorite(), true, false, 4, null);
                nm.e eVar = (nm.e) ((mm.b) gVar3.f24504d);
                eVar.getClass();
                eVar.t().l(basicItem);
                return Unit.f26487a;
            case 6:
                j5.b0 b0Var = (j5.b0) obj;
                b0Var.getClass();
                String str = ((nn.c) obj2).f31114c;
                j5.z.h(str != null ? str : "", b0Var);
                return Unit.f26487a;
            case 7:
                return Boolean.valueOf(Intrinsics.areEqual(((n9.e) obj).f30742b, ((n9.e) obj2).f30742b));
            case 8:
                o90.n nVar2 = (o90.n) obj2;
                n90.n nVar3 = (n90.n) obj;
                nVar3.getClass();
                nVar2.L((String) CollectionsKt.W(nVar2.f32176a), nVar3);
                return Unit.f26487a;
            case 9:
                ((View) obj).getClass();
                ((no.p) ((fo.b) obj2)).a();
                return Unit.f26487a;
            case 10:
                k4.d dVar = (k4.d) obj;
                dVar.getClass();
                long j9 = lv.s.f28217b;
                float fC0 = dVar.c0(14);
                k4.d.M(dVar, j9, 0L, 0L, (((long) Float.floatToRawIntBits(fC0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fC0))), (k4.h) obj2, 230);
                return Unit.f26487a;
            case 11:
                TermsConsentView termsConsentView = (TermsConsentView) obj2;
                String str2 = (String) obj;
                int i14 = TermsConsentView.f9069e;
                str2.getClass();
                if (termsConsentView.f9071b == null) {
                    Toast.makeText(termsConsentView.getContext(), R.string.terms_choose_country_toast, 1).show();
                } else {
                    Context context = termsConsentView.getContext();
                    context.getClass();
                    if (mv.r0.u(context)) {
                        Country country = termsConsentView.f9071b;
                        country.getClass();
                        if (Intrinsics.areEqual(str2, country.getPrivacyUrl())) {
                            i80.n nVar4 = termsConsentView.f9073d;
                            if (nVar4 != null) {
                                nVar4.invoke(str2, ct.a.PRIVACY, Integer.valueOf(R.string.webview_privacy_title));
                            }
                        } else {
                            Country country2 = termsConsentView.f9071b;
                            country2.getClass();
                            if (Intrinsics.areEqual(str2, country2.getTermsUrl()) && (nVar = termsConsentView.f9073d) != null) {
                                nVar.invoke(str2, ct.a.TERMS_AND_CONDITIONS, Integer.valueOf(R.string.webview_terms_and_condition_title));
                            }
                        }
                    } else {
                        Toast.makeText(termsConsentView.getContext(), R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 1).show();
                    }
                }
                return Unit.f26487a;
            case 12:
                ((z5.c) obj).getClass();
                float fH = ((z1.r) ((com.google.firebase.messaging.a0) obj2).f12782e).f46655j.h();
                if (Float.isNaN(fH)) {
                    fH = 0.0f;
                }
                return new z5.j((((long) 0) << 32) | (((long) j80.c.b(fH)) & 4294967295L));
            case 13:
                q5.d0 d0Var = (q5.d0) obj;
                return ((q5.j) obj2).a(new q5.d0(null, d0Var.f36009b, d0Var.f36010c, d0Var.f36011d, d0Var.f36012e)).getValue();
            case 14:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) obj2;
                f70.h hVar = (f70.h) obj;
                int i15 = DeepLinkActivity.f8988i;
                hVar.getClass();
                if (hVar instanceof sj.b) {
                    jb.s sVarD = jb.s.d(deepLinkActivity);
                    sVarD.getClass();
                    sVarD.a("UserPolling2");
                    sj.b bVar = (sj.b) hVar;
                    Intent intentPutExtra = new Intent(deepLinkActivity, (Class<?>) MainActivity.class).putExtra("DESTINATION", bVar.f39040a).putExtra("ACTION", bVar.f39041b);
                    intentPutExtra.getClass();
                    deepLinkActivity.startActivity(intentPutExtra);
                    deepLinkActivity.finishAffinity();
                } else {
                    if (!(hVar instanceof sj.a)) {
                        if (Intrinsics.areEqual(hVar, el.c.f16079a)) {
                            new pl.f().show(deepLinkActivity.getSupportFragmentManager(), "TERMS");
                        }
                        return Boolean.valueOf(z);
                    }
                    sj.a aVar3 = (sj.a) hVar;
                    if (aVar3.f39039b) {
                        jb.s sVarD2 = jb.s.d(deepLinkActivity);
                        sVarD2.getClass();
                        sVarD2.a("UserPolling2");
                    }
                    Toast.makeText(deepLinkActivity, aVar3.f39038a, 1).show();
                    Intent intent = new Intent(deepLinkActivity, (Class<?>) LoginActivity.class);
                    intent.putExtra("ORIGIN", f70.i.DEEP_LINK);
                    deepLinkActivity.startActivity(intent, mv.a.b(deepLinkActivity));
                    deepLinkActivity.finish();
                }
                z = true;
                return Boolean.valueOf(z);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ItemViewActivity itemViewActivity = (ItemViewActivity) obj2;
                f70.h hVar2 = (f70.h) obj;
                int i16 = ItemViewActivity.f9011k;
                hVar2.getClass();
                if (hVar2 instanceof f70.a) {
                    itemViewActivity.getOnBackPressedDispatcher().d();
                } else if (hVar2 instanceof ok.x) {
                    nk.f fVar = ((ok.x) hVar2).f32637a;
                    fVar.getClass();
                    sk.f fVar2 = new sk.f();
                    fVar2.setArguments(jb.u.x(new Pair("item_type", fVar)));
                    fVar2.show(itemViewActivity.getSupportFragmentManager(), "ItemExplainerBottomSheet");
                } else if (hVar2 instanceof ok.y) {
                    ok.y yVar = (ok.y) hVar2;
                    String str3 = yVar.f32639a;
                    boolean z11 = yVar.f32640b;
                    vj.c cVar2 = yVar.f32641c;
                    str3.getClass();
                    cVar2.getClass();
                    sk.d dVar2 = new sk.d();
                    dVar2.setArguments(jb.u.x(new Pair("item_id", ItemId.m197boximpl(str3)), new Pair("is_item_subscribed", Boolean.valueOf(z11)), new Pair("reminder_details", cVar2)));
                    dVar2.show(itemViewActivity.getSupportFragmentManager(), "ItemExplainerBottomSheet");
                } else {
                    if (!(hVar2 instanceof ok.w)) {
                        if (hVar2 instanceof ok.v) {
                            ok.v vVar = (ok.v) hVar2;
                            BasicItem basicItem2 = vVar.f32626a;
                            String str4 = vVar.f32627b;
                            String str5 = vVar.f32628c;
                            String str6 = vVar.f32629d;
                            boolean z12 = vVar.f32630e;
                            basicItem2.getClass();
                            str4.getClass();
                            yi.r rVar = new yi.r();
                            rVar.setCancelable(false);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("ITEM", basicItem2);
                            bundle.putString("RETURN_URL", str4);
                            bundle.putString("FILLER_TYPE", str5);
                            bundle.putBoolean("IS_MULTI_ITEM", false);
                            if (str6 != null) {
                                bundle.putString("VOUCHER_ID", str6);
                            }
                            bundle.putBoolean("PRESELECTED_CURRENCY_VOUCHER", z12);
                            rVar.setArguments(bundle);
                            rVar.show(itemViewActivity.getSupportFragmentManager(), "CHECKOUT");
                        }
                        return Boolean.valueOf(z);
                    }
                    ok.w wVar = (ok.w) hVar2;
                    BasicItem basicItem3 = wVar.f32632a;
                    String str7 = wVar.f32633b;
                    String str8 = wVar.f32634c;
                    String str9 = str8 != null ? str8 : null;
                    boolean z13 = wVar.f32635d;
                    basicItem3.getClass();
                    sk.b bVar2 = new sk.b();
                    bVar2.setArguments(jb.u.x(new Pair("item", basicItem3), new Pair("fillerType", str7), new Pair("voucherId", str9), new Pair("preselectedCurrencyVoucher", Boolean.valueOf(z13))));
                    bVar2.show(itemViewActivity.getSupportFragmentManager(), "ItemAllergensBottomSheet");
                }
                z = true;
                return Boolean.valueOf(z);
            case 16:
                VoucherActivity voucherActivity = (VoucherActivity) obj2;
                f70.h hVar3 = (f70.h) obj;
                int i17 = VoucherActivity.f9440h;
                hVar3.getClass();
                if (!(hVar3 instanceof f70.a)) {
                    if (hVar3 instanceof ts.b0) {
                        voucherActivity.c0();
                    }
                    return Boolean.valueOf(z);
                }
                if (voucherActivity.b0().f37267e.f45488a.getValue() instanceof ss.k1) {
                    Boolean bool = (Boolean) voucherActivity.b0().f37263a.a("IS_ONBOARDING");
                    if (bool != null ? bool.booleanValue() : false) {
                        voucherActivity.c0();
                    } else {
                        voucherActivity.finish();
                    }
                } else {
                    voucherActivity.b0().f37264b.f39263c.i(ts.k.f40453a);
                }
                z = true;
                return Boolean.valueOf(z);
            case 17:
                VoucherExperienceActivity voucherExperienceActivity = (VoucherExperienceActivity) obj2;
                f70.h hVar4 = (f70.h) obj;
                int i18 = VoucherExperienceActivity.f9443h;
                hVar4.getClass();
                if (!(hVar4 instanceof f70.a)) {
                    if (hVar4 instanceof ts.b0) {
                        voucherExperienceActivity.E();
                    }
                    return Boolean.valueOf(z);
                }
                if (voucherExperienceActivity.D().f37262e.f45488a.getValue() instanceof ss.d1) {
                    Boolean bool2 = (Boolean) voucherExperienceActivity.D().f37258a.a("IS_ONBOARDING");
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        voucherExperienceActivity.E();
                    } else {
                        voucherExperienceActivity.finish();
                    }
                } else {
                    ss.e1 e1Var = (ss.e1) voucherExperienceActivity.D().f37262e.f45488a.getValue();
                    if ((e1Var instanceof ss.c1) && ((ss.c1) e1Var).f39147d) {
                        voucherExperienceActivity.D().f37259b.f39256d.i(new ts.v(false));
                    } else {
                        voucherExperienceActivity.D().f37259b.f39256d.i(ts.w.f40470a);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 18:
                Drawable drawable = (Drawable) obj2;
                k4.d dVar3 = (k4.d) obj;
                i4.t tVarI = dVar3.g0().i();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (dVar3.d() >> 32)), (int) Float.intBitsToFloat((int) (dVar3.d() & 4294967295L)));
                drawable.draw(i4.d.a(tVarI));
                return Unit.f26487a;
            case 19:
                r40.h hVar5 = (r40.h) obj2;
                h8.a aVar4 = (h8.a) obj;
                h8.e eVar2 = r40.h.f37623c;
                Iterator it = aVar4.a().entrySet().iterator();
                long j11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            h8.e eVar3 = (h8.e) entry.getKey();
                            Set set = (Set) entry.getValue();
                            String strB = hVar5.b(System.currentTimeMillis());
                            if (set.contains(strB)) {
                                Object[] objArr = {strB};
                                HashSet hashSet = new HashSet(1);
                                Object obj4 = objArr[0];
                                Objects.requireNonNull(obj4);
                                if (hashSet.add(obj4)) {
                                    aVar4.f(eVar3, Collections.unmodifiableSet(hashSet));
                                    j11++;
                                } else {
                                    i4.a.f(j4.s.j(obj4, "duplicate element: "));
                                }
                            } else {
                                aVar4.e(eVar3);
                            }
                        }
                    } else if (j11 == 0) {
                        aVar4.e(eVar2);
                    } else {
                        aVar4.f(eVar2, Long.valueOf(j11));
                    }
                }
                return null;
            case 20:
                r5.g gVar4 = (r5.g) obj;
                String str10 = ((r5.g) obj2) == gVar4 ? " > " : "   ";
                if (gVar4 instanceof r5.a) {
                    sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    r5.a aVar5 = (r5.a) gVar4;
                    sb2.append(aVar5.f37626a.f29538b.length());
                    sb2.append(", newCursorPosition=");
                    i11 = aVar5.f37627b;
                } else {
                    if (!(gVar4 instanceof r5.w)) {
                        if (gVar4 instanceof r5.v) {
                            strConcat = ((r5.v) gVar4).toString();
                        } else if (gVar4 instanceof r5.e) {
                            strConcat = ((r5.e) gVar4).toString();
                        } else if (gVar4 instanceof r5.f) {
                            strConcat = ((r5.f) gVar4).toString();
                        } else if (gVar4 instanceof r5.x) {
                            strConcat = ((r5.x) gVar4).toString();
                        } else if (gVar4 instanceof r5.j) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (gVar4 instanceof r5.d) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String simpleName = Reflection.getOrCreateKotlinClass(gVar4.getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(simpleName);
                        }
                        return str10.concat(strConcat);
                    }
                    sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                    r5.w wVar2 = (r5.w) gVar4;
                    sb2.append(wVar2.f37710a.f29538b.length());
                    sb2.append(", newCursorPosition=");
                    i11 = wVar2.f37711b;
                }
                strConcat = r8.k.o(sb2, i11, ')');
                return str10.concat(strConcat);
            case 21:
                ((r9.d) obj2).f37799a.setValue((q9.l) obj);
                return Unit.f26487a;
            case 22:
                ((rc.e) obj2).f37882k = true;
                return Unit.f26487a;
            case 23:
                m1.a aVar6 = (m1.a) obj2;
                ItemTagInfo itemTagInfo = (ItemTagInfo) obj;
                itemTagInfo.getClass();
                aVar6.getClass();
                ((y80.m1) ((f0.f2) aVar6.f28697a).f16653f).i(new ok.o(itemTagInfo));
                return Unit.f26487a;
            case 24:
                InviteFriendsActivity inviteFriendsActivity = (InviteFriendsActivity) obj2;
                f70.h hVar6 = (f70.h) obj;
                int i19 = InviteFriendsActivity.f9301j;
                hVar6.getClass();
                if (hVar6 instanceof pq.g) {
                    pq.g gVar5 = (pq.g) hVar6;
                    String string = inviteFriendsActivity.getString(R.string.c2c_v3_invite_friends_share_body_text, gVar5.f35610a);
                    string.getClass();
                    String string2 = inviteFriendsActivity.getString(R.string.c2c_v3_invite_friends_share_header_text);
                    string2.getClass();
                    ArrayList arrayList = new ArrayList((Collection) gVar5.f35611b);
                    f70.g gVar6 = inviteFriendsActivity.f9304h;
                    if (gVar6 != null) {
                        gVar = gVar6;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationController");
                    }
                    gVar.a(new f70.q(string, string2, arrayList));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                return Boolean.valueOf(Intrinsics.areEqual(((s0.l0) obj).f38379a, (m0.r) obj2));
            case 26:
                s2.c cVar3 = (s2.c) obj2;
                cVar3.f38760q.invoke((o2.a) obj, b5.o.e(cVar3, c5.v0.f7390b));
                return Unit.f26487a;
            case 27:
                ((Function1) obj).invoke((o2.a) obj2);
                return Unit.f26487a;
            case 28:
                z0 z0Var = (z0) obj2;
                q2 q2Var = (q2) obj;
                if (q2Var instanceof s2.a) {
                    z0Var.invoke(((s2.a) q2Var).f38758o);
                    return Boolean.TRUE;
                }
                h2.b("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            default:
                ((IOException) obj).getClass();
                TimeZone timeZone = r90.g.f37815a;
                ((s90.g) obj2).f38945k = true;
                return Unit.f26487a;
        }
    }

    public /* synthetic */ z0(Object obj, int i11) {
        this.f29894a = i11;
        this.f29895b = obj;
    }
}
