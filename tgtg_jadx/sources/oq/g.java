package oq;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;
import ss.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32929k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y80.i f32930m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(y80.i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f32928j = i11;
        this.f32930m = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32928j) {
            case 0:
                g gVar = new g(this.f32930m, cVar, 0);
                gVar.l = obj;
                return gVar;
            case 1:
                g gVar2 = new g(this.f32930m, cVar, 1);
                gVar2.l = obj;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f32930m, cVar, 2);
                gVar3.l = obj;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f32930m, cVar, 3);
                gVar4.l = obj;
                return gVar4;
            case 4:
                g gVar5 = new g(this.f32930m, cVar, 4);
                gVar5.l = obj;
                return gVar5;
            case 5:
                g gVar6 = new g(this.f32930m, cVar, 5);
                gVar6.l = obj;
                return gVar6;
            case 6:
                g gVar7 = new g(this.f32930m, cVar, 6);
                gVar7.l = obj;
                return gVar7;
            case 7:
                g gVar8 = new g(this.f32930m, cVar, 7);
                gVar8.l = obj;
                return gVar8;
            case 8:
                g gVar9 = new g(this.f32930m, cVar, 8);
                gVar9.l = obj;
                return gVar9;
            case 9:
                g gVar10 = new g(this.f32930m, cVar, 9);
                gVar10.l = obj;
                return gVar10;
            case 10:
                g gVar11 = new g(this.f32930m, cVar, 10);
                gVar11.l = obj;
                return gVar11;
            case 11:
                g gVar12 = new g(this.f32930m, cVar, 11);
                gVar12.l = obj;
                return gVar12;
            case 12:
                g gVar13 = new g(this.f32930m, cVar, 12);
                gVar13.l = obj;
                return gVar13;
            case 13:
                g gVar14 = new g(this.f32930m, cVar, 13);
                gVar14.l = obj;
                return gVar14;
            case 14:
                g gVar15 = new g(this.f32930m, cVar, 14);
                gVar15.l = obj;
                return gVar15;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                g gVar16 = new g(this.f32930m, cVar, 15);
                gVar16.l = obj;
                return gVar16;
            case 16:
                g gVar17 = new g(this.f32930m, cVar, 16);
                gVar17.l = obj;
                return gVar17;
            case 17:
                g gVar18 = new g(this.f32930m, cVar, 17);
                gVar18.l = obj;
                return gVar18;
            case 18:
                g gVar19 = new g(this.f32930m, cVar, 18);
                gVar19.l = obj;
                return gVar19;
            case 19:
                g gVar20 = new g(this.f32930m, cVar, 19);
                gVar20.l = obj;
                return gVar20;
            case 20:
                g gVar21 = new g(this.f32930m, cVar, 20);
                gVar21.l = obj;
                return gVar21;
            case 21:
                g gVar22 = new g(this.f32930m, cVar, 21);
                gVar22.l = obj;
                return gVar22;
            case 22:
                g gVar23 = new g(this.f32930m, cVar, 22);
                gVar23.l = obj;
                return gVar23;
            case 23:
                g gVar24 = new g(this.f32930m, cVar, 23);
                gVar24.l = obj;
                return gVar24;
            case 24:
                g gVar25 = new g(this.f32930m, cVar, 24);
                gVar25.l = obj;
                return gVar25;
            case 25:
                g gVar26 = new g(this.f32930m, cVar, 25);
                gVar26.l = obj;
                return gVar26;
            case 26:
                g gVar27 = new g(this.f32930m, cVar, 26);
                gVar27.l = obj;
                return gVar27;
            case 27:
                g gVar28 = new g(this.f32930m, cVar, 27);
                gVar28.l = obj;
                return gVar28;
            case 28:
                g gVar29 = new g(this.f32930m, cVar, 28);
                gVar29.l = obj;
                return gVar29;
            default:
                g gVar30 = new g(this.f32930m, cVar, 29);
                gVar30.l = obj;
                return gVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32928j) {
        }
        return ((g) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32928j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f32929k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    lh.q qVar = new lh.q((y80.j) this.l, 29);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(qVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f32929k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar = new k((y80.j) this.l, 0);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f32929k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar2 = new k((y80.j) this.l, 1);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar2, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f32929k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar3 = new k((y80.j) this.l, 2);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar3, this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f32929k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar4 = new k((y80.j) this.l, 8);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar4, this) == aVar5) {
                    }
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f32929k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar5 = new k((y80.j) this.l, 9);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar5, this) == aVar6) {
                    }
                }
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f32929k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar6 = new k((y80.j) this.l, 10);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar6, this) == aVar7) {
                    }
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f32929k;
                if (i18 != 0) {
                    if (i18 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar7 = new k((y80.j) this.l, 11);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar7, this) == aVar8) {
                    }
                }
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f32929k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar8 = new k((y80.j) this.l, 12);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar8, this) == aVar9) {
                    }
                }
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f32929k;
                if (i21 != 0) {
                    if (i21 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar9 = new k((y80.j) this.l, 13);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar9, this) == aVar10) {
                    }
                }
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f32929k;
                if (i22 != 0) {
                    if (i22 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar10 = new k((y80.j) this.l, 14);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar10, this) == aVar11) {
                    }
                }
                break;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                int i23 = this.f32929k;
                if (i23 != 0) {
                    if (i23 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar11 = new k((y80.j) this.l, 15);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar11, this) == aVar12) {
                    }
                }
                break;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                int i24 = this.f32929k;
                if (i24 != 0) {
                    if (i24 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar12 = new k((y80.j) this.l, 16);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar12, this) == aVar13) {
                    }
                }
                break;
            case 13:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                int i25 = this.f32929k;
                if (i25 != 0) {
                    if (i25 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar13 = new k((y80.j) this.l, 17);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar13, this) == aVar14) {
                    }
                }
                break;
            case 14:
                y70.a aVar15 = y70.a.COROUTINE_SUSPENDED;
                int i26 = this.f32929k;
                if (i26 != 0) {
                    if (i26 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar14 = new k((y80.j) this.l, 18);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar14, this) == aVar15) {
                    }
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                y70.a aVar16 = y70.a.COROUTINE_SUSPENDED;
                int i27 = this.f32929k;
                if (i27 != 0) {
                    if (i27 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar15 = new k((y80.j) this.l, 19);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar15, this) == aVar16) {
                    }
                }
                break;
            case 16:
                y70.a aVar17 = y70.a.COROUTINE_SUSPENDED;
                int i28 = this.f32929k;
                if (i28 != 0) {
                    if (i28 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar16 = new k((y80.j) this.l, 20);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar16, this) == aVar17) {
                    }
                }
                break;
            case 17:
                y70.a aVar18 = y70.a.COROUTINE_SUSPENDED;
                int i29 = this.f32929k;
                if (i29 != 0) {
                    if (i29 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar17 = new k((y80.j) this.l, 21);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar17, this) == aVar18) {
                    }
                }
                break;
            case 18:
                y70.a aVar19 = y70.a.COROUTINE_SUSPENDED;
                int i31 = this.f32929k;
                if (i31 != 0) {
                    if (i31 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar18 = new k((y80.j) this.l, 22);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar18, this) == aVar19) {
                    }
                }
                break;
            case 19:
                y70.a aVar20 = y70.a.COROUTINE_SUSPENDED;
                int i32 = this.f32929k;
                if (i32 != 0) {
                    if (i32 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar19 = new k((y80.j) this.l, 23);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar19, this) == aVar20) {
                    }
                }
                break;
            case 20:
                y70.a aVar21 = y70.a.COROUTINE_SUSPENDED;
                int i33 = this.f32929k;
                if (i33 != 0) {
                    if (i33 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar20 = new k((y80.j) this.l, 24);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar20, this) == aVar21) {
                    }
                }
                break;
            case 21:
                y70.a aVar22 = y70.a.COROUTINE_SUSPENDED;
                int i34 = this.f32929k;
                if (i34 != 0) {
                    if (i34 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar21 = new k((y80.j) this.l, 25);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar21, this) == aVar22) {
                    }
                }
                break;
            case 22:
                y70.a aVar23 = y70.a.COROUTINE_SUSPENDED;
                int i35 = this.f32929k;
                if (i35 != 0) {
                    if (i35 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar22 = new k((y80.j) this.l, 26);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar22, this) == aVar23) {
                    }
                }
                break;
            case 23:
                y70.a aVar24 = y70.a.COROUTINE_SUSPENDED;
                int i36 = this.f32929k;
                if (i36 != 0) {
                    if (i36 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar23 = new k((y80.j) this.l, 27);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar23, this) == aVar24) {
                    }
                }
                break;
            case 24:
                y70.a aVar25 = y70.a.COROUTINE_SUSPENDED;
                int i37 = this.f32929k;
                if (i37 != 0) {
                    if (i37 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar24 = new k((y80.j) this.l, 28);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar24, this) == aVar25) {
                    }
                }
                break;
            case 25:
                y70.a aVar26 = y70.a.COROUTINE_SUSPENDED;
                int i38 = this.f32929k;
                if (i38 != 0) {
                    if (i38 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar25 = new k((y80.j) this.l, 29);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(kVar25, this) == aVar26) {
                    }
                }
                break;
            case 26:
                y70.a aVar27 = y70.a.COROUTINE_SUSPENDED;
                int i39 = this.f32929k;
                if (i39 != 0) {
                    if (i39 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    o0 o0Var = new o0((y80.j) this.l, 0);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(o0Var, this) == aVar27) {
                    }
                }
                break;
            case 27:
                y70.a aVar28 = y70.a.COROUTINE_SUSPENDED;
                int i41 = this.f32929k;
                if (i41 != 0) {
                    if (i41 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    o0 o0Var2 = new o0((y80.j) this.l, 1);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(o0Var2, this) == aVar28) {
                    }
                }
                break;
            case 28:
                y70.a aVar29 = y70.a.COROUTINE_SUSPENDED;
                int i42 = this.f32929k;
                if (i42 != 0) {
                    if (i42 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    o0 o0Var3 = new o0((y80.j) this.l, 2);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(o0Var3, this) == aVar29) {
                    }
                }
                break;
            default:
                y70.a aVar30 = y70.a.COROUTINE_SUSPENDED;
                int i43 = this.f32929k;
                if (i43 != 0) {
                    if (i43 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    o0 o0Var4 = new o0((y80.j) this.l, 3);
                    this.l = null;
                    this.f32929k = 1;
                    if (this.f32930m.collect(o0Var4, this) == aVar30) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
