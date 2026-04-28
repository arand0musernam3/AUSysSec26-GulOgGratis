package androidx.lifecycle;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3496k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y80.i f3497m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(y80.i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f3495j = i11;
        this.f3497m = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f3495j) {
            case 0:
                n nVar = new n(this.f3497m, cVar, 0);
                nVar.l = obj;
                return nVar;
            case 1:
                n nVar2 = new n(this.f3497m, cVar, 1);
                nVar2.l = obj;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f3497m, cVar, 2);
                nVar3.l = obj;
                return nVar3;
            case 3:
                n nVar4 = new n(this.f3497m, cVar, 3);
                nVar4.l = obj;
                return nVar4;
            case 4:
                n nVar5 = new n(this.f3497m, cVar, 4);
                nVar5.l = obj;
                return nVar5;
            case 5:
                n nVar6 = new n(this.f3497m, cVar, 5);
                nVar6.l = obj;
                return nVar6;
            case 6:
                n nVar7 = new n(this.f3497m, cVar, 6);
                nVar7.l = obj;
                return nVar7;
            case 7:
                n nVar8 = new n(this.f3497m, cVar, 7);
                nVar8.l = obj;
                return nVar8;
            case 8:
                n nVar9 = new n(this.f3497m, cVar, 8);
                nVar9.l = obj;
                return nVar9;
            case 9:
                n nVar10 = new n(this.f3497m, cVar, 9);
                nVar10.l = obj;
                return nVar10;
            case 10:
                n nVar11 = new n(this.f3497m, cVar, 10);
                nVar11.l = obj;
                return nVar11;
            case 11:
                n nVar12 = new n(this.f3497m, cVar, 11);
                nVar12.l = obj;
                return nVar12;
            case 12:
                n nVar13 = new n(this.f3497m, cVar, 12);
                nVar13.l = obj;
                return nVar13;
            case 13:
                n nVar14 = new n(this.f3497m, cVar, 13);
                nVar14.l = obj;
                return nVar14;
            case 14:
                n nVar15 = new n(this.f3497m, cVar, 14);
                nVar15.l = obj;
                return nVar15;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar16 = new n(this.f3497m, cVar, 15);
                nVar16.l = obj;
                return nVar16;
            case 16:
                n nVar17 = new n(this.f3497m, cVar, 16);
                nVar17.l = obj;
                return nVar17;
            case 17:
                n nVar18 = new n(this.f3497m, cVar, 17);
                nVar18.l = obj;
                return nVar18;
            case 18:
                n nVar19 = new n(this.f3497m, cVar, 18);
                nVar19.l = obj;
                return nVar19;
            case 19:
                n nVar20 = new n(this.f3497m, cVar, 19);
                nVar20.l = obj;
                return nVar20;
            case 20:
                n nVar21 = new n(this.f3497m, cVar, 20);
                nVar21.l = obj;
                return nVar21;
            case 21:
                n nVar22 = new n(this.f3497m, cVar, 21);
                nVar22.l = obj;
                return nVar22;
            case 22:
                n nVar23 = new n(this.f3497m, cVar, 22);
                nVar23.l = obj;
                return nVar23;
            case 23:
                n nVar24 = new n(this.f3497m, cVar, 23);
                nVar24.l = obj;
                return nVar24;
            case 24:
                n nVar25 = new n(this.f3497m, cVar, 24);
                nVar25.l = obj;
                return nVar25;
            case 25:
                n nVar26 = new n(this.f3497m, cVar, 25);
                nVar26.l = obj;
                return nVar26;
            case 26:
                n nVar27 = new n(this.f3497m, cVar, 26);
                nVar27.l = obj;
                return nVar27;
            case 27:
                n nVar28 = new n(this.f3497m, cVar, 27);
                nVar28.l = obj;
                return nVar28;
            case 28:
                n nVar29 = new n(this.f3497m, cVar, 28);
                nVar29.l = obj;
                return nVar29;
            default:
                n nVar30 = new n(this.f3497m, cVar, 29);
                nVar30.l = obj;
                return nVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3495j) {
        }
        return ((n) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3495j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f3496k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    m mVar = new m((l0) this.l, 0);
                    this.f3496k = 1;
                    if (this.f3497m.collect(mVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f3496k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar = new nj.d(0);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f3496k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar2 = new nj.d(1);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar2, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f3496k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar3 = new nj.d(2);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar3, this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f3496k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar4 = new nj.d(3);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar4, this) == aVar5) {
                    }
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f3496k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar5 = new nj.d(4);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar5, this) == aVar6) {
                    }
                }
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f3496k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar = new lh.q((y80.j) this.l, 6);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar, this) == aVar7) {
                    }
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f3496k;
                if (i18 != 0) {
                    if (i18 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar6 = new nj.d(5);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar6, this) == aVar8) {
                    }
                }
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f3496k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar7 = new nj.d(6);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar7, this) == aVar9) {
                    }
                }
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f3496k;
                if (i21 != 0) {
                    if (i21 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar2 = new lh.q((y80.j) this.l, 7);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar2, this) == aVar10) {
                    }
                }
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f3496k;
                if (i22 != 0) {
                    if (i22 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar3 = new lh.q((y80.j) this.l, 8);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar3, this) == aVar11) {
                    }
                }
                break;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                int i23 = this.f3496k;
                if (i23 != 0) {
                    if (i23 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar4 = new lh.q((y80.j) this.l, 9);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar4, this) == aVar12) {
                    }
                }
                break;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                int i24 = this.f3496k;
                if (i24 != 0) {
                    if (i24 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar5 = new lh.q((y80.j) this.l, 10);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar5, this) == aVar13) {
                    }
                }
                break;
            case 13:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                int i25 = this.f3496k;
                if (i25 != 0) {
                    if (i25 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar6 = new lh.q((y80.j) this.l, 11);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar6, this) == aVar14) {
                    }
                }
                break;
            case 14:
                y70.a aVar15 = y70.a.COROUTINE_SUSPENDED;
                int i26 = this.f3496k;
                if (i26 != 0) {
                    if (i26 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.d dVar8 = new nj.d(7);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(dVar8, this) == aVar15) {
                    }
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                y70.a aVar16 = y70.a.COROUTINE_SUSPENDED;
                int i27 = this.f3496k;
                if (i27 != 0) {
                    if (i27 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar7 = new lh.q((y80.j) this.l, 12);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar7, this) == aVar16) {
                    }
                }
                break;
            case 16:
                y70.a aVar17 = y70.a.COROUTINE_SUSPENDED;
                int i28 = this.f3496k;
                if (i28 != 0) {
                    if (i28 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar8 = new lh.q((y80.j) this.l, 13);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar8, this) == aVar17) {
                    }
                }
                break;
            case 17:
                y70.a aVar18 = y70.a.COROUTINE_SUSPENDED;
                int i29 = this.f3496k;
                if (i29 != 0) {
                    if (i29 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar9 = new lh.q((y80.j) this.l, 14);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar9, this) == aVar18) {
                    }
                }
                break;
            case 18:
                y70.a aVar19 = y70.a.COROUTINE_SUSPENDED;
                int i31 = this.f3496k;
                if (i31 != 0) {
                    if (i31 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar10 = new lh.q((y80.j) this.l, 15);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar10, this) == aVar19) {
                    }
                }
                break;
            case 19:
                y70.a aVar20 = y70.a.COROUTINE_SUSPENDED;
                int i32 = this.f3496k;
                if (i32 != 0) {
                    if (i32 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar11 = new lh.q((y80.j) this.l, 16);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar11, this) == aVar20) {
                    }
                }
                break;
            case 20:
                y70.a aVar21 = y70.a.COROUTINE_SUSPENDED;
                int i33 = this.f3496k;
                if (i33 != 0) {
                    if (i33 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar12 = new lh.q((y80.j) this.l, 17);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar12, this) == aVar21) {
                    }
                }
                break;
            case 21:
                y70.a aVar22 = y70.a.COROUTINE_SUSPENDED;
                int i34 = this.f3496k;
                if (i34 != 0) {
                    if (i34 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar13 = new lh.q((y80.j) this.l, 18);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar13, this) == aVar22) {
                    }
                }
                break;
            case 22:
                y70.a aVar23 = y70.a.COROUTINE_SUSPENDED;
                int i35 = this.f3496k;
                if (i35 != 0) {
                    if (i35 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar14 = new lh.q((y80.j) this.l, 19);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar14, this) == aVar23) {
                    }
                }
                break;
            case 23:
                y70.a aVar24 = y70.a.COROUTINE_SUSPENDED;
                int i36 = this.f3496k;
                if (i36 != 0) {
                    if (i36 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar15 = new lh.q((y80.j) this.l, 20);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar15, this) == aVar24) {
                    }
                }
                break;
            case 24:
                y70.a aVar25 = y70.a.COROUTINE_SUSPENDED;
                int i37 = this.f3496k;
                if (i37 != 0) {
                    if (i37 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar16 = new lh.q((y80.j) this.l, 21);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar16, this) == aVar25) {
                    }
                }
                break;
            case 25:
                y70.a aVar26 = y70.a.COROUTINE_SUSPENDED;
                int i38 = this.f3496k;
                if (i38 != 0) {
                    if (i38 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar17 = new lh.q((y80.j) this.l, 22);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar17, this) == aVar26) {
                    }
                }
                break;
            case 26:
                y70.a aVar27 = y70.a.COROUTINE_SUSPENDED;
                int i39 = this.f3496k;
                if (i39 != 0) {
                    if (i39 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar18 = new lh.q((y80.j) this.l, 23);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar18, this) == aVar27) {
                    }
                }
                break;
            case 27:
                y70.a aVar28 = y70.a.COROUTINE_SUSPENDED;
                int i41 = this.f3496k;
                if (i41 != 0) {
                    if (i41 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar19 = new lh.q((y80.j) this.l, 24);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar19, this) == aVar28) {
                    }
                }
                break;
            case 28:
                y70.a aVar29 = y70.a.COROUTINE_SUSPENDED;
                int i42 = this.f3496k;
                if (i42 != 0) {
                    if (i42 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar20 = new lh.q((y80.j) this.l, 27);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar20, this) == aVar29) {
                    }
                }
                break;
            default:
                y70.a aVar30 = y70.a.COROUTINE_SUSPENDED;
                int i43 = this.f3496k;
                if (i43 != 0) {
                    if (i43 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar21 = new lh.q((y80.j) this.l, 28);
                    this.l = null;
                    this.f3496k = 1;
                    if (this.f3497m.collect(qVar21, this) == aVar30) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
