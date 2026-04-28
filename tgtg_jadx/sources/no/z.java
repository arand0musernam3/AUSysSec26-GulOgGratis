package no;

import com.app.tgtg.model.remote.order.Order;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31311k;
    public final /* synthetic */ m0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, int i11, x70.c cVar) {
        super(2, cVar);
        this.f31310j = 0;
        this.l = m0Var;
        this.f31311k = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31310j) {
            case 0:
                return new z(this.l, this.f31311k, cVar);
            case 1:
                return new z(this.l, cVar, 1);
            case 2:
                return new z(this.l, cVar, 2);
            case 3:
                return new z(this.l, cVar, 3);
            case 4:
                return new z(this.l, cVar, 4);
            case 5:
                return new z(this.l, cVar, 5);
            case 6:
                return new z(this.l, cVar, 6);
            case 7:
                return new z(this.l, cVar, 7);
            case 8:
                return new z(this.l, cVar, 8);
            default:
                return new z(this.l, cVar, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31310j) {
        }
        return ((z) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objR;
        Object objR2;
        int i11 = this.f31310j;
        int i12 = 2;
        m0 m0Var = this.l;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Order order = (Order) m0Var.f22215i.f45488a.getValue();
                m0Var.k(order != null ? order.m427copyT5PkTcg(((-524481) & 1) != 0 ? order.cancelUntil : null, ((-524481) & 2) != 0 ? order.confirmationEmail : null, ((-524481) & 4) != 0 ? order.foodHandlingInstruction : null, ((-524481) & 8) != 0 ? order.buffetHandlingInstruction : null, ((-524481) & 16) != 0 ? order.canUserSupplyPackaging : false, ((-524481) & 32) != 0 ? order.packagingOption : null, ((-524481) & 64) != 0 ? order.isRated : true, ((-524481) & 128) != 0 ? order.canBeRated : false, ((-524481) & 256) != 0 ? order.itemCollectionInfo : null, ((-524481) & 512) != 0 ? order.itemCoverImage : null, ((-524481) & 1024) != 0 ? order.itemLogo : null, ((-524481) & NewHope.SENDB_BYTES) != 0 ? order.itemId : null, ((-524481) & 4096) != 0 ? order.itemName : null, ((-524481) & 8192) != 0 ? order.pickupInterval : null, ((-524481) & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? order.pickupLocation : null, ((-524481) & 32768) != 0 ? order.storeTimeZone : null, ((-524481) & 65536) != 0 ? order.price : null, ((-524481) & 131072) != 0 ? order.totalPrice : null, ((-524481) & 262144) != 0 ? order.quantity : 0, ((-524481) & 524288) != 0 ? order.overallRating : new Integer(this.f31311k), ((-524481) & 1048576) != 0 ? order.orderId : null, ((-524481) & 2097152) != 0 ? order.redeemInterval : null, ((-524481) & 4194304) != 0 ? order.state : null, ((-524481) & 8388608) != 0 ? order.storeBranch : null, ((-524481) & 16777216) != 0 ? order.storeId : null, ((-524481) & 33554432) != 0 ? order.storeLogo : null, ((-524481) & 67108864) != 0 ? order.storeName : null, ((-524481) & 134217728) != 0 ? order.timeOfPurchase : null, ((-524481) & 268435456) != 0 ? order.isBuffet : false, ((-524481) & 536870912) != 0 ? order.canShowBestBeforeExplainer : false, ((-524481) & 1073741824) != 0 ? order.orderType : null, ((-524481) & Integer.MIN_VALUE) != 0 ? order.pickupWindowChanged : false, (1073741823 & 1) != 0 ? order.additionalOrderInformation : null, (1073741823 & 2) != 0 ? order.paymentMethodDisplayName : null, (1073741823 & 4) != 0 ? order.cancelledOrRefundedAtUtc : null, (1073741823 & 8) != 0 ? order.redeemedAtUtc : null, (1073741823 & 16) != 0 ? order.supportReqCreatedAtUtc : null, (1073741823 & 32) != 0 ? order.expectedBankDays : 0, (1073741823 & 64) != 0 ? order.paymentState : null, (1073741823 & 128) != 0 ? order.cancellingEntity : null, (1073741823 & 256) != 0 ? order.isSupportAvailable : false, (1073741823 & 512) != 0 ? order.isExcludedFromExpenseRating : false, (1073741823 & 1024) != 0 ? order.needsSync : null, (1073741823 & NewHope.SENDB_BYTES) != 0 ? order.hasCollectionTimeChanged : false, (1073741823 & 4096) != 0 ? order.hasCollectionStateChanged : false, (1073741823 & 8192) != 0 ? order.calendarEventId : 0, (1073741823 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? order.hasDynamicPrice : null, (1073741823 & 32768) != 0 ? order.invitationId : null, (1073741823 & 65536) != 0 ? order.redeemingUserId : null, (1073741823 & 131072) != 0 ? order.isDonation : false, (1073741823 & 262144) != 0 ? order.isEligibleForReward : false, (1073741823 & 524288) != 0 ? order.hasMultiplePayments : false, (1073741823 & 1048576) != 0 ? order.totalPricePaidWithExternalProvider : null, (1073741823 & 2097152) != 0 ? order.totalPricePaidWithVoucher : null, (1073741823 & 4194304) != 0 ? order.itemCategory : null, (1073741823 & 8388608) != 0 ? order.isFavorite : null, (1073741823 & 16777216) != 0 ? order.isMultiItem : null, (1073741823 & 33554432) != 0 ? order.isEdible : false, (1073741823 & 67108864) != 0 ? order.orderItems : null, (1073741823 & 134217728) != 0 ? order.specificationLines : null, (1073741823 & 268435456) != 0 ? order.totalPricePaidForDelivery : null, (1073741823 & 536870912) != 0 ? order.discountAppliedPercentage : null) : null);
                return Unit.f26487a;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f31311k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    mn.j jVar = new mn.j(m0Var.K.getData(), 1);
                    this.f31311k = 1;
                    objR = y80.r.r(jVar, this);
                    if (objR == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objR = obj;
                }
                Boolean bool = (Boolean) objR;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f31311k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var = m0Var.U;
                    Boolean bool2 = Boolean.FALSE;
                    this.f31311k = 1;
                    a2Var.getClass();
                    a2Var.k(null, bool2);
                    if (Unit.f26487a == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f31311k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    m0Var.L = null;
                    a2 a2Var2 = m0Var.W;
                    Boolean bool3 = Boolean.FALSE;
                    this.f31311k = 1;
                    a2Var2.getClass();
                    a2Var2.k(null, bool3);
                    if (Unit.f26487a == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f31311k;
                if (i16 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var3 = m0Var.O;
                    Boolean bool4 = Boolean.FALSE;
                    this.f31311k = 1;
                    a2Var3.getClass();
                    a2Var3.k(null, bool4);
                    if (Unit.f26487a == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f31311k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var4 = m0Var.f31261o0;
                    Boolean bool5 = Boolean.FALSE;
                    this.f31311k = 1;
                    a2Var4.getClass();
                    a2Var4.k(null, bool5);
                    if (Unit.f26487a == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f31311k;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                d8.f fVar = m0Var.K;
                bm.o oVar = new bm.o(i12, objArr == true ? 1 : 0, 24);
                this.f31311k = 1;
                Object objR3 = xz.b.r(fVar, oVar, this);
                return objR3 == aVar7 ? aVar7 : objR3;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f31311k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                d8.f fVar2 = m0Var.K;
                bm.o oVar2 = new bm.o(i12, objArr2 == true ? 1 : 0, 25);
                this.f31311k = 1;
                Object objR4 = xz.b.r(fVar2, oVar2, this);
                return objR4 == aVar8 ? aVar8 : objR4;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f31311k;
                if (i21 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var5 = m0Var.f31261o0;
                    Boolean bool6 = Boolean.TRUE;
                    this.f31311k = 1;
                    a2Var5.getClass();
                    a2Var5.k(null, bool6);
                    if (Unit.f26487a == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i21 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f31311k;
                if (i22 == 0) {
                    ba0.g.M(obj);
                    mn.j jVar2 = new mn.j(m0Var.K.getData(), 2);
                    this.f31311k = 1;
                    objR2 = y80.r.r(jVar2, this);
                    if (objR2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i22 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objR2 = obj;
                }
                Boolean bool7 = (Boolean) objR2;
                return Boolean.valueOf(bool7 != null ? bool7.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(m0 m0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31310j = i11;
        this.l = m0Var;
    }
}
