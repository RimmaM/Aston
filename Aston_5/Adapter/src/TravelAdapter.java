class TravelAdapter implements TravelService{
        private OldTicket type;

        public TravelAdapter(OldTicket type){
            this.type = type;
        }

        public void bookTrip() {
            type.makeReservation();
    }


}