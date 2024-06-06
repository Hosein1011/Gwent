package model;

public enum CardType {

    // ********************************************************** SKELLIGE *****************************************************

    mardoeme(new SpecialCard(3, Action.mardroeme, "/img/lg/special_mardroeme.jpg")),
    berserker(new InFieldCard("combat", false, 4, 1, Action.berserker, Faction.skellige, "/img/lg/special_mardroeme.jpg")),
    vidkaarl(new InFieldCard("combat", false, 14, 0, Action.moralBoost, Faction.skellige, "/img/lg/skellige_vildkaarl.jpg")),
    svanrige(new InFieldCard("combat", false, 4, 1, null, Faction.skellige, "/img/lg/skellige_svanrige.jpg")),
    udalryk(new InFieldCard("combat", false, 4, 1, null, Faction.skellige, "/img/lg/skellige_udalryk.jpg")),
    donar(new InFieldCard("combat", false, 4, 1, null, Faction.skellige, "/img/lg/skellige_donar.jpg")),
    clanAnCraite(new InFieldCard("combat", false, 6, 3, Action.tightBond, Faction.skellige, "/img/lg/skellige_donar.jpg")), // should we construct this card ?? // this card doesn't have image
    modman(new InFieldCard("combat", false, 6, 1, null, Faction.skellige, "/img/lg/skellige_donar.jpg")),
    cerys(new InFieldCard("combat", true, 10, 1, Action.muster, Faction.skellige, "/img/lg/skellige_cerys.jpg")),
    kambi(new InFieldCard("combat", true, 11, 1, Action.transFormers, Faction.skellige, "/img/lg/skellige_kambi.jpg")),
    birna(new InFieldCard("combat", false, 2, 1, Action.medic, Faction.skellige, "/img/lg/skellige_birna.jpg")),
    brokvaArcher(new InFieldCard("range", false, 6, 3, Action.tightBond, Faction.skellige, "/img/lg/skellige_brokva_archer.jpg")),
    dimunPirate(new InFieldCard("range", false, 6, 1, Action.scorch, Faction.skellige, "/img/lg/skellige_dimun_pirate.jpg")),
    ermion(new InFieldCard("range", true, 8, 1, Action.mardroeme, Faction.skellige, "/img/lg/skellige_ermion.jpg")),
    hjalmar(new InFieldCard("range", true, 10, 1, null, Faction.skellige, "/img/lg/skellige_hjalmar.jpg")),
    youngBerserker(new InFieldCard("range", false, 2, 3, Action.berserker, Faction.skellige, "/img/lg/skellige_young_berserker.jpg")),
    youngVidkaarl(new InFieldCard("range", false, 8, 0, Action.tightBond, Faction.skellige, "/img/lg/skellige_young_vildkaarl.jpg")),
    lightLongship(new InFieldCard("range", false, 4, 3, Action.muster, Faction.skellige, "/img/lg/skellige_light_longship.jpg")),
    warLongship(new InFieldCard("siege", false, 6, 3, Action.tightBond, Faction.skellige, "/img/lg/skellige_war_longship.jpg")),
    draig(new InFieldCard("siege", false, 2, 3, Action.commandersHorn, Faction.skellige, "/img/lg/skellige_draig.jpg")),
    olaf(new InFieldCard("aglie", false, 12, 1, Action.moralBoost, Faction.skellige, "/img/lg/skellige_olaf.jpg")),


    // ******************************************************************* SCOIA TAEL *******************************************

    skirmisher(new InFieldCard("range", false, 2, 3, Action.muster, Faction.scoiaTael, "/img/lg/scoiatael_elf_skirmisher.jpg")),
    yaevinn(new InFieldCard("agile", false, 6, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_yaevinn.jpg")),
    ciaranAep(new InFieldCard("aglie", false, 3, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_ciaran.jpg")),
    dennisCranmer(new InFieldCard("combat", false, 6, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_dennis.jpg")),
    // dolBlathannaScout(new InFieldCards("agile", false, 6, 3, null, Faction.scoiaTael, "/img/lg/skellige_draig.jpg")),
    dolBlathannaArcher(new InFieldCard("range", false, 4, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_dol_archer.jpg")),
    dwarvenSkirmisher(new InFieldCard("combat", false, 3, 3, Action.muster, Faction.scoiaTael, "/img/lg/scoiatael_dwarf.jpg")),
    havekarHealer(new InFieldCard("range", false, 0, 3, Action.medic, Faction.scoiaTael, "/img/lg/scoiatael_havekar_nurse.jpg")),
    havekarSmuggler(new InFieldCard("combat", false, 5, 3, Action.muster, Faction.scoiaTael, "/img/lg/scoiatael_havekar_support.jpg")),
    idaEmeanAep(new InFieldCard("range", false, 6, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_ida.jpg")),
    Riordain(new InFieldCard("range", false, 1, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_riordain.jpg")),
    toruviel(new InFieldCard("range", false, 2, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_toruviel.jpg")),
    vriheddBrigadeRecruit(new InFieldCard("range", false, 4, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_vrihedd_brigade.jpg")),
    vriheddBrigadeVeteran(new InFieldCard("agile", false, 5, 2, null, Faction.scoiaTael, "/img/lg/scoiatael_vrihedd_brigade_1.jpg")),
    milva(new InFieldCard("range", false, 10, 1, Action.moralBoost, Faction.scoiaTael, "/img/lg/scoiatael_milva.jpg")),
    seasenthessis(new InFieldCard("range", true, 10, 1, null, Faction.scoiaTael, "/img/lg/skellige_draig.jpg")), // there is no any image for this card
    schirru(new InFieldCard("siege", false, 8, 1, Action.scorch, Faction.scoiaTael, "/img/lg/scoiatael_schirru.jpg")),
    eithne(new InFieldCard("range", true, 10, 1, null, Faction.scoiaTael, "/img/lg/scoiatael_eithne.jpg")),
    isengrimFaoiltiarna(new InFieldCard("combat", true, 10, 1, Action.moralBoost, Faction.scoiaTael, "/img/lg/scoiatael_isengrim.jpg")),

    // ******************************************************************* NORTHERN REALMS *********************************************************

    ballista(new InFieldCard("seige", false, 6, 2, null, Faction.northernRealms, "/img/lg/realms_ballista.jpg")),
    catapult(new InFieldCard("seige", false, 8, 2, Action.tightBond, Faction.northernRealms, "/img/lg/realms_catapult_1.jpg")),
    dragonHunter(new InFieldCard("range", false, 5, 3, Action.tightBond, Faction.northernRealms, "/img/lg/scoiatael_isengrim.jpg")), // there is no image for this card
    dunBannerMedic(new InFieldCard("seige", false, 5, 1, Action.medic, Faction.northernRealms, "/img/lg/realms_banner_nurse.jpg")),
    esteradThyssen(new InFieldCard("combat", true, 10, 1, null, Faction.northernRealms, "/img/lg/realms_esterad.jpg")),
    johnNatalis(new InFieldCard("combat", true, 10, 1, null, Faction.northernRealms, "/img/lg/realms_natalis.jpg")),
    kaedweniSiegeExpert(new InFieldCard("seige", false, 1, 3, Action.moralBoost, Faction.northernRealms, "/img/lg/realms_kaedwen_siege.jpg")),
    philippaEilhart(new InFieldCard("range", true, 10, 1, null, Faction.northernRealms, "/img/lg/realms_philippa.jpg")),
    poorFuckingInfantry(new InFieldCard("combat", false, 1, 4, Action.tightBond, Faction.northernRealms, "/img/lg/realms_poor_infantry.jpg")),
    princeStennis(new InFieldCard("combat", false, 5, 1, Action.spy, Faction.northernRealms, "/img/lg/realms_stennis.jpg")),
    redanianFootSoldier(new InFieldCard("combat", false, 1, 2, null, Faction.northernRealms, "/img/lg/realms_redania.jpg")),
    sabrinaGlevissing(new InFieldCard("range", false, 4, 1, null, Faction.northernRealms, "/img/lg/realms_sabrina.jpg")),
    siegeTower(new InFieldCard("seige", false, 6, 1, null, Faction.northernRealms, "/img/lg/realms_siege_tower.jpg")),
    siegfriedOfDenesle(new InFieldCard("combat", false, 5, 1, null, Faction.northernRealms, "/img/lg/realms_siegfried.jpg")),
    sigismundDijkstra(new InFieldCard("combat", false, 4, 1, Action.spy, Faction.northernRealms, "/img/lg/realms_dijkstra.jpg")),
    síleDeTansarville(new InFieldCard("range", false, 5, 1, null, Faction.northernRealms, "/img/lg/scoiatael_isengrim.jpg")), // there is no image for this card
    thaler(new InFieldCard("seige", false, 1, 1, Action.spy, Faction.northernRealms, "/img/lg/realms_thaler.jpg")),
    vernonRoche(new InFieldCard("combat", true, 10, 1, null, Faction.northernRealms, "/img/lg/realms_vernon.jpg")),
    ves(new InFieldCard("combat", false, 5, 1, null, Faction.northernRealms, "/img/lg/realms_ves.jpg")),
    yarpenZirgrin(new InFieldCard("combat", false, 2, 1, null, Faction.northernRealms, "/img/lg/realms_yarpen.jpg")),

    // ***************************************************** Monsters *********************************************************

    draug(new InFieldCard("combat", true, 10, 1, null, Faction.monsters, "/img/lg/monsters_draug.jpg")),
    leshen(new InFieldCard("combat", true, 10, 1, null, Faction.monsters, "/img/lg/monsters_leshen.jpg")),
    kayran(new InFieldCard("Agile", true, 8, 1, Action.moralBoost, Faction.monsters, "/img/lg/monsters_kayran.jpg")),
    toad(new InFieldCard("range", false, 7, 1, Action.scorch, Faction.monsters, "/img/lg/monsters_toad.jpg")),
    arachasBehemoth(new InFieldCard("siege", false, 6, 1, Action.muster, Faction.monsters, "/img/lg/monsters_arachas_behemoth.jpg")),
    croneWeaves(new InFieldCard("combat", false, 6, 1, Action.muster, Faction.monsters, "/img/lg/monsters_witch_velen_1.jpg")),
    croneWhispess(new InFieldCard("combat", false, 6, 1, Action.muster, Faction.monsters, "/img/lg/monsters_witch_velen_2.jpg")),
    earthElemental(new InFieldCard("siege", false, 6, 1, null, Faction.monsters, "/img/lg/monsters_earth_elemental.jpg")),
    fiend(new InFieldCard("combat", false, 6, 1, null, Faction.monsters, "/img/lg/monsters_fiend.jpg")),
    fireElemental(new InFieldCard("siege", false, 6, 1, null, Faction.monsters, "/img/lg/monsters_fire_elemental.jpg")),
    forktail(new InFieldCard("combat", false, 5, 1, null, Faction.monsters, "/img/lg/monsters_forktail.jpg")),
    graveHag(new InFieldCard("range", false, 5, 1, null, Faction.monsters, "/img/lg/monsters_gravehag.jpg")),
    griffin(new InFieldCard("combat", false, 5, 1, null, Faction.monsters, "/img/lg/monsters_gryffin.jpg")),
    iceGiant(new InFieldCard("siege", false, 5, 1, null, Faction.monsters, "/img/lg/monsters_frost_giant.jpg")),
    plagueMaiden(new InFieldCard("combat", false, 5, 1, null, Faction.monsters, "/img/lg/monsters_mighty_maiden.jpg")),
    vampireKatakan(new InFieldCard("combat", false, 5, 1, Action.muster, Faction.monsters, "/img/lg/monsters_katakan.jpg")),
    werewolf(new InFieldCard("combat", false, 5, 1, null, Faction.monsters, "/img/lg/monsters_werewolf.jpg")),
    arachas(new InFieldCard("combat", false, 4, 3, Action.muster, Faction.monsters, "/img/lg/monsters_arachas.jpg")),
    vampireBruxa(new InFieldCard("combat", false, 4, 1, Action.muster, Faction.monsters, "/img/lg/monsters_bruxa.jpg")),
    vampireEkimmara(new InFieldCard("combat", false, 4, 1, Action.muster, Faction.monsters, "/img/lg/monsters_ekkima.jpg")),
    vampireFleder(new InFieldCard("combat", false, 4, 1, Action.muster, Faction.monsters, "/img/lg/monsters_fleder.jpg")),
    vampireGarkain(new InFieldCard("combat", false, 4, 1, Action.muster, Faction.monsters, "/img/lg/monsters_garkain.jpg")),
    cockatrice(new InFieldCard("range", false, 2, 1, null, Faction.monsters, "/img/lg/monsters_cockatrice.jpg")),
    endrega(new InFieldCard("range", false, 2, 1, null, Faction.monsters, "/img/lg/monsters_endrega.jpg")),
    foglet(new InFieldCard("combat", false, 2, 1, null, Faction.monsters, "/img/lg/monsters_fogling.jpg")),
    harpy(new InFieldCard("Agile", false, 2, 1, null, Faction.monsters, "/img/lg/monsters_harpy.jpg")),
    nekker(new InFieldCard("combat", false, 2, 3, Action.muster, Faction.monsters, "/img/lg/monsters_nekker.jpg")),
    wyvern(new InFieldCard("range", false, 2, 1, null, Faction.monsters, "/img/lg/monsters_wyvern.jpg")),
    ghoul(new InFieldCard("combat", false, 1, 3, Action.muster, Faction.monsters, "/img/lg/monsters_ghoul.jpg")),

    //************************************************ CardsForALlFaction **************************************************************

    bitingFrost(new SpecialCard(3, null, "/img/lg/weather_frost.jpg")),
    impenetrableFog(new SpecialCard(3, null, "/img/lg/weather_fog.jpg")),
    torrentialRain(new SpecialCard(3, null, "/img/lg/weather_rain.jpg")),
    decoy(new SpecialCard(3, Action.decoy, "/img/lg/neutral_decoy.jpg")),
    dandelion(new InFieldCard("combat", false, 2, 1, Action.commandersHorn, Faction.all, "/img/lg/neutral_dandelion.jpg")),
    emielRegis(new InFieldCard("combat", false, 5, 1, null, Faction.all, "/img/lg/neutral_emiel.jpg")),
    gaunterODimm(new InFieldCard("siege", false, 2, 1, Action.muster, Faction.all, "/img/lg/neutral_gaunter_odimm.jpg")),
    gaunterODimmDarkness(new InFieldCard("range", false, 4, 3, Action.muster, Faction.all, "/img/lg/neutral_gaunter_odimm_darkness.jpg")),
    mysteriousElf(new InFieldCard("combat", false, 0, 1, Action.spy, Faction.all, "/img/lg/neutral_mysterious_elf.jpg")),
    olgierdVonEverc(new InFieldCard("agile", false, 6, 1, Action.moralBoost, Faction.all, "/img/lg/neutral_olgierd.jpg")),
    trissMerigold(new InFieldCard("combat", false, 7, 1, null, Faction.all, "/img/lg/neutral_triss.jpg")),
    villentretenmerth(new InFieldCard("combat", false, 7, 1, Action.scorch, Faction.all, "/img/lg/neutral_villen.jpg")),
    yenneferOfVengerberg(new InFieldCard("range", false, 7, 1, Action.medic, Faction.all, "/img/lg/neutral_yennefer.jpg")),
    zoltanChivay(new InFieldCard("combat", false, 5, 1, null, Faction.all, "/img/lg/neutral_zoltan.jpg")),


    //************************************************* NilfGaard ******************************************************

    imperaBrigadeGuard(new InFieldCard("combat", false, 3, 4, Action.tightBond, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_imperal_brigade.jpg")),
    stefanSkellen(new InFieldCard("combat", false, 9, 1, Action.spy, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_stefan.jpg")),
    youngEmissary(new InFieldCard("combat", false, 5, 2, Action.tightBond, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_young_emissary_1.jpg")),
    cahirMawrDyffrynAepCeallach(new InFieldCard("combat", false, 6, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_cahir.jpg")),

    vattierDeRideaux(new InFieldCard("combat", false, 4, 1, Action.spy, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_vattier.jpg")),
    mennoCoehorn(new InFieldCard("combat", false, 10, 1, Action.medic, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_menno.jpg")),
    puttkammer(new InFieldCard("range", false, 3, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_puttkammer.jpg")),
    blackInfantryArcher(new InFieldCard("range", false, 10, 2, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_black_archer.jpg")),
    tiborEggebracht(new InFieldCard("range", true, 10, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_tibor.jpg")),
    renauldAepMatsen(new InFieldCard("range", false, 5, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_renuald.jpg")),
    fringillaVigo(new InFieldCard("range", false, 1, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_fringilla.jpg")),
    rottenMangonel(new InFieldCard("siege", false, 4, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_rotten.jpg")),
    zerrikanianFireScorpion(new InFieldCard("siege", false, 5, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_zerri.jpg")),
    siegeEngineer(new InFieldCard("siege", false, 6, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_siege_engineer.jpg")),
    morvranVoorhis(new InFieldCard("siege", true, 10, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_moorvran.jpg")),
    cynthia(new InFieldCard("range", false, 4, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_cynthia.jpg")),
    etolianAuxiliaryArchers(new InFieldCard("range", true, 1, 2, Action.medic, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_archer_support.jpg")),
    lethoOfGulet(new InFieldCard("combat", false, 10, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_letho.jpg")),
    morteisen(new InFieldCard("combat", false, 3, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_morteisen.jpg")),
    nausicaaCavalryRider(new InFieldCard("combat", false, 2, 3, Action.tightBond, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_nauzicaa_2.jpg")),
    rainfarn(new InFieldCard("combat", false, 4, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_rainfarn.jpg")),
    siegeTechnician(new InFieldCard("siege", false, 0, 1, Action.medic, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_siege_support.jpg")),
    sweers(new InFieldCard("range", false, 2, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_sweers.jpg")),
    vattierdeRideaux(new InFieldCard("combat", false, 4, 1, Action.spy, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_vattier.jpg")),
    vanhemar(new InFieldCard("range", false, 4, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_vanhemar.jpg")),
    vreemde(new InFieldCard("combat", false, 2, 1, null, Faction.nilfgaardianEmpire, "/img/lg/nilfgaard_vreemde.jpg")),

    ;
    private final Card card;

    CardType(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}
